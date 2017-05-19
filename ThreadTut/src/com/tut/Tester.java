package com.tut;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a =  new int[]{5,2,8,6,4,9};
		int temp;
		
		for(int i =0;i<a.length;i++){
		
			for(int j = i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
			
		}
		
		for(int b : a){
			System.out.println(" value is : "+b);
		}		
	}

}
