package com.work;

public class Soldiers implements Runnable{

	private Base base;
	
	public Soldiers(Base base) {
		// TODO Auto-generated constructor stub
		this.base = base;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Comman.count = Comman.count+1;
		System.out.println("number of count "+Comman.count);
		synchronized (base) {
			
				try {
					base.wait();
					System.out.println("I am going"+Thread.currentThread().getName());
				    
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				base.sendPackate();
				System.out.println("data send to port");
		}
		
	}

}
