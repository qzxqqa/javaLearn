package com.imooc.method;

public class MethodDemo {
	public void printStar() {
		System.out.println("****11**********");
	}
	public static void main(String[] args) {
		MethodDemo myMethodDemo = new MethodDemo();
		myMethodDemo.printStar();
		System.out.println("欢迎来到Java的世界");
		myMethodDemo.printStar();
	}
}
