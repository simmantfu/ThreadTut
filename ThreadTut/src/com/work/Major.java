package com.work;

public class Major implements Runnable {

	private Base base;

	public Major(Base base) {
		// TODO Auto-generated constructor stub

		this.base = base;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		synchronized (base) {

			try {
				Thread.sleep(2000);
				if (Comman.count == 10) {
					base.notifyAll();
					System.out.println("Again rest");
					Comman.count = 0;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
