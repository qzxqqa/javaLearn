package com.imooc.array;

public class SortDemo {
	public static void main(String[] args) {
		int[] a= {12, 8, 23, 6, 11, 45, 19};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int n:a) {
			System.out.print(n+" ");
		}
	}
}
