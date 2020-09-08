package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		// 声明一个整形数组
		int[] intArray;
		// 声明一个字符串类型的数组
		String[] strArray;
		// 创建数组
		intArray=new int[5];
		strArray=new String[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<intArray.length;i++) {
			System.out.println("请输入第" + (i+1) + "个元素");
			intArray[i] = sc.nextInt();
		}
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i] + "   ");
		}
		System.out.println();
		for(int n:intArray) {
			System.out.print(n + "   ");
		}
	}
}