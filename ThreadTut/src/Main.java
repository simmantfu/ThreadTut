
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Messagenr msg= new Messagenr();
		
		User user = new User(msg);
		Thread thread = new Thread(user);
		thread.start();
		
		Producer producer = new Producer(msg);
	    Thread thread2 = new Thread(producer);
	    thread2.start();
	    
	}

}
