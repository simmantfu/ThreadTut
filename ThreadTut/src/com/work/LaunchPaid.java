package com.work;

public class LaunchPaid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base base = new Base();
		
		for(int i = 0;i<10;i++){
		Soldiers prepare = new Soldiers(base);
		Thread thread = new Thread(prepare);
		thread.start();
		}
		
		Major major = new Major(base);
		Thread thread =  new Thread(major);
		thread.start();
	}

}
