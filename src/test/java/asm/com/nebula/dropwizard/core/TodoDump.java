package asm.com.nebula.dropwizard.core;

import java.util.*;
import org.objectweb.asm.*;

public class TodoDump implements Opcodes {

	public static byte[] dump() throws Exception {

		ClassWriter cw = new ClassWriter(0);
		FieldVisitor fv;
		MethodVisitor mv;
		AnnotationVisitor av0;

		cw.visit(52, ACC_PUBLIC + ACC_SUPER, "com/nebula/dropwizard/core/Todo", null, "java/lang/Object", null);

		cw.visitSource("Todo.java", null);

		{
			fv = cw.visitField(0, "completed", "Lnebula/define/YesNo;", null, null);
			fv.visitEnd();
		}
		{
			fv = cw.visitField(0, "title", "Lnebula/define/Title;", null, null);
			fv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Lnebula/define/YesNo;Lnebula/define/Title;)V", null, null);
			mv.visitParameter("completed", 0);
			mv.visitParameter("title", 0);
			mv.visitCode();
			Label l0 = new Label();
			mv.visitLabel(l0);
			mv.visitLineNumber(11, l0);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
			Label l1 = new Label();
			mv.visitLabel(l1);
			mv.visitLineNumber(12, l1);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 1);
			mv.visitFieldInsn(PUTFIELD, "com/nebula/dropwizard/core/Todo", "completed", "Lnebula/define/YesNo;");
			Label l2 = new Label();
			mv.visitLabel(l2);
			mv.visitLineNumber(13, l2);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 2);
			mv.visitFieldInsn(PUTFIELD, "com/nebula/dropwizard/core/Todo", "title", "Lnebula/define/Title;");
			Label l3 = new Label();
			mv.visitLabel(l3);
			mv.visitLineNumber(14, l3);
			mv.visitInsn(RETURN);
			Label l4 = new Label();
			mv.visitLabel(l4);
			mv.visitLocalVariable("this", "Lcom/nebula/dropwizard/core/Todo;", null, l0, l4, 0);
			mv.visitLocalVariable("completed", "Lnebula/define/YesNo;", null, l0, l4, 1);
			mv.visitLocalVariable("title", "Lnebula/define/Title;", null, l0, l4, 2);
			mv.visitMaxs(2, 3);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "changeTitle", "(Lnebula/define/Title;)V", null, null);
			mv.visitParameter("title", 0);
			mv.visitCode();
			Label l0 = new Label();
			mv.visitLabel(l0);
			mv.visitLineNumber(17, l0);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 1);
			mv.visitFieldInsn(PUTFIELD, "com/nebula/dropwizard/core/Todo", "title", "Lnebula/define/Title;");
			

			Label l1 = new Label();
			mv.visitLabel(l1);
			mv.visitLineNumber(18, l1);
			mv.visitInsn(RETURN);
			Label l2 = new Label();
			mv.visitLabel(l2);
			mv.visitLocalVariable("this", "Lcom/nebula/dropwizard/core/Todo;", null, l0, l2, 0);
			mv.visitLocalVariable("title", "Lnebula/define/Title;", null, l0, l2, 1);
			mv.visitMaxs(2, 2);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "changeCompleted", "(Lnebula/define/YesNo;)V", null, null);
			mv.visitParameter("completed", 0);
			mv.visitCode();
			Label l0 = new Label();
			mv.visitLabel(l0);
			mv.visitLineNumber(21, l0);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 1);
			mv.visitFieldInsn(PUTFIELD, "com/nebula/dropwizard/core/Todo", "completed", "Lnebula/define/YesNo;");
//			mv.visitVarInsn(ALOAD, 0);
//			mv.visitVarInsn(ALOAD, 1);
//			mv.visitMethodInsn(INVOKEVIRTUAL, "com/nebula/dropwizard/core/Todo2", "setCompleted", "(Lnebula/define/YesNo;)V", false);

			Label l1 = new Label();
			mv.visitLabel(l1);
			mv.visitLineNumber(22, l1);
			mv.visitInsn(RETURN);
			Label l2 = new Label();
			mv.visitLabel(l2);
			mv.visitLocalVariable("this", "Lcom/nebula/dropwizard/core/Todo;", null, l0, l2, 0);
			mv.visitLocalVariable("completed", "Lnebula/define/YesNo;", null, l0, l2, 1);
			mv.visitMaxs(2, 2);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC, "delete", "()V", null, null);
			mv.visitCode();
			Label l0 = new Label();
			mv.visitLabel(l0);
			mv.visitLineNumber(26, l0);
			mv.visitInsn(RETURN);
			Label l1 = new Label();
			mv.visitLabel(l1);
			mv.visitLocalVariable("this", "Lcom/nebula/dropwizard/core/Todo;", null, l0, l1, 0);
			mv.visitMaxs(0, 1);
			mv.visitEnd();
		}
		cw.visitEnd();

		return cw.toByteArray();
	}
}