package turnAndFlag;


public class maintest {
	public static void main(String[] args) {
		myThread thread0 = new myThread(0);
		myThread thread1 = new myThread(1);
		thread0.start();
		thread1.start();
		try {
			thread0.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
