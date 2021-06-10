package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable{

	int value;
	
	public ThreadedGreeter(int value) {
		this.value = value;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(value);
		if(value <= 50) {
			Thread t = new Thread(new ThreadedGreeter(value + 1));
			t.start();
			try {
				t.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
