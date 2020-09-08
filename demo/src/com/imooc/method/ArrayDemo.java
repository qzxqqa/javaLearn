package com.imooc.method;

public class ArrayDemo {
	//求数组元素的平均值
	public float avai(float[] args) {
		float sum=0;
		for(int i=0;i<args.length;i++) {
			sum+=args[i];
		}
		return sum/args.length;
	}
	public static void main(String[] args) {
		//定义对象
		ArrayDemo am = new ArrayDemo();
		//创建float类型的数组并初始化
		float[] arr = {78.5f,98.5f,65.5f,32.5f,75.5f};
		//调用方法求平均值并打印输出
		float ava = am.avai(arr);
		System.out.println("数组的平均值为：" + ava);
	}
}
