package com.nebula.dropwizard.core;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.util.ASMifier;
import org.objectweb.asm.util.TraceClassVisitor;

public class TodoTest {

	@Test
	public void testTodo() throws IOException {
		ClassReader cr = new ClassReader(Todo.class.getName());
		ClassVisitor typemaker = new TypeMaker(Opcodes.ASM5);
		cr.accept(typemaker, ClassReader.SKIP_DEBUG);

		ClassVisitor visitor = new TraceClassVisitor(null, new ASMifier(), new PrintWriter(System.out));
		cr.accept(visitor, ClassReader.EXPAND_FRAMES);

		System.out.println(typemaker.toString());
	}

	@Test
	public void testPrintTodo2() throws IOException {
		ClassReader cr = new ClassReader(Todo2.class.getName());
		ClassVisitor typemaker = new TypeMaker(Opcodes.ASM5);
		// cr.accept(typemaker, ClassReader.SKIP_DEBUG);

		ClassVisitor visitor = new TraceClassVisitor(null, new ASMifier(), new PrintWriter(System.out));
		cr.accept(visitor, ClassReader.EXPAND_FRAMES);
	}

	@Test
	public void testMake() throws IOException {
		ClassReader cr = new ClassReader(Todo.class.getName());
		TraceClassVisitor traceClassVisitor = new TraceClassVisitor(null, new ASMifier(), new PrintWriter(System.out));
		DomainMaker domainMaker = new DomainMaker(Opcodes.ASM5, traceClassVisitor);

		cr.accept(domainMaker, ClassReader.SKIP_DEBUG);

		System.out.println(domainMaker.toString());
	}
}
