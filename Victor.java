package com.coding.prac;

import java.util.Arrays;

public class Victor {
	public static void main(String[] args) {
		int size=3;
		int [] arr= {1,2,3};
		int k=2;
		System.out.println(adding(size, arr, k));
	}static int adding(int size,int[] arr,int k) {
		int sum=0;
		while(arr.length>1) {
			Arrays.sort(arr);
		int[] s=new int[(arr.length+(arr.length%2))/2];
		int n=0;
		for(int i=0;i<arr.length-1;i=i+2) {
			s[n]=arr[i]+arr[i+1];
			sum+=s[n]*k;
			n++;
		}
		if(arr.length%2==1) {
			s[n]=arr[arr.length-1];
		}
		arr=Arrays.copyOf(s, s.length);
	}
	
return sum;
}
}
