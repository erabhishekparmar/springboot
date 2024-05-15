package com.debug;

public class Debug {
	
	public static int getSum(int arr[]) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum  = sum + arr[i];
		}
		sum=sum+10;
		return sum;
	}
	
	public static void main(String[] args) {
		 
		int arr[] = {1,4,2,5,6}; // 18
		
		System.out.println(getSum(arr));
		
	}
}
