
public class User implements Runnable {

	private Messagenr msg;

	public User(Messagenr msg) {
		this.msg = msg;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("User Thread started");
		
		synchronized (msg) {
			
			try {
				System.out.println("wating for producer thread");
				msg.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(" producer thread invoke complete");
		System.out.println("name of dish"+msg.getMsg());

	}

}
