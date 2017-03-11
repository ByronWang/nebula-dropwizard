package com.nebula.dropwizard.core;

import java.util.ArrayList;
import java.util.List;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import static org.objectweb.asm.Opcodes.*;

public class DomainMaker extends ClassVisitor {
	Type type;

	public DomainMaker(int api, ClassVisitor cv) {
		super(api, cv);
	}

	public DomainMaker(int api) {
		super(api);
	}

	String typeDescriptor;

	@Override
	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
		typeDescriptor = name.replace('.', '/');
		super.visit(version, access, name, signature, superName, interfaces);
	}

	@Override
	public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
		return super.visitField(access, name, desc, signature, value);
	}

	@Override
	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
		MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
		TypeMakerMethodVisitor methodVisitor = new TypeMakerMethodVisitor(api, mv, access, name, desc, signature,
				exceptions);
		return methodVisitor;
	}

	class TypeMakerMethodVisitor extends MethodVisitor {
		String[] types = new String[100];

		public TypeMakerMethodVisitor(int api, MethodVisitor mv, int access, String name, String desc, String signature,
				String[] exceptions) {
			super(api, mv);
			int i = 0;
			types[i++] = typeDescriptor;
			for (Type type : Type.getArgumentTypes(desc)) {
				types[i++] = type.getClassName();
			}
		}

		List<Integer> stack = new ArrayList<>();

		@Override
		public void visitVarInsn(int opcode, int var) {
			super.visitVarInsn(opcode, var);
			stack.add(var);
		}

		@Override
		public void visitFieldInsn(int opcode, String owner, String name, String desc) {
			// TODO Auto-generated method stub
			if (opcode == Opcodes.PUTFIELD) {
				// mv.visitVarInsn(ALOAD, 0);
				// mv.visitVarInsn(ALOAD, 1);
				// mv.visitFieldInsn(PUTFIELD,
				// "com/nebula/dropwizard/core/Todo", "completed",
				// "Lnebula/define/YesNo;");
				// mv.visitVarInsn(ALOAD, 0);
				// mv.visitVarInsn(ALOAD, 1);

				String op1 = types[stack.get(stack.size() - 2)];
				String op2 = types[stack.get(stack.size() - 1)];
				String methodDescriptor = Type.getMethodDescriptor(Type.VOID_TYPE, new Type[] { Type.getType(op2) });
				super.visitMethodInsn(INVOKEVIRTUAL, op1, "set" + toBeanProperties(name), methodDescriptor, false);
			}else{
				super.visitFieldInsn(opcode, owner, name, desc);
			}
		}

	}

	static String toBeanProperties(String name) {
		return Character.toUpperCase(name.charAt(0)) + name.substring(1);
	}

}
