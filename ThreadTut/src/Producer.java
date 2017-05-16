import javax.swing.plaf.SliderUI;

public class Producer implements Runnable {

	private Messagenr msg;

	public Producer(Messagenr msg) {
		// TODO Auto-generated constructor stub

		this.msg = msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Producer started ");
	    
		synchronized (msg) {
			try {
				Thread.sleep(5000);
				msg.setMsg("Butter chikcen");
				msg.notifyAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Producer cycle is done.");
		
	}

}
