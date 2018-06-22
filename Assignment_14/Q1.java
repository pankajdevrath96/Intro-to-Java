package Assignment_14;
class thread implements Runnable{

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++)
		{
			System.out.println( Thread.currentThread().getName()+" "+Thread.currentThread().getState()+" "+i*i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println( Thread.currentThread().getName()+" "+Thread.currentThread().getState());
	} 
	 
}

 

public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		thread obj=new thread();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		System.out.println( Thread.currentThread().getName()+" "+Thread.currentThread().getState());
		t1.start();
		t2.start();
		t2.join();
		System.out.println( Thread.currentThread().getName()+" "+Thread.currentThread().getState());

	}

}
