package firstpackage;

public class MultithreadingTask1 extends Thread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a+b);
		
		ThreadTest1 thread1 = new ThreadTest1();
		try {
			thread1.run();
			thread1.sleep(2000);
		}
		catch(Exception e) {
			
			System.out.println("Excepption Caught! : "+e);
		}
		
		
		ThreadTest2 thread2 = new ThreadTest2();
		thread2.run();
		
	}

}

class ThreadTest1 extends Thread{
	@Override
	public void run() {
		for(int i=11;i<=22;i++) {
			if(i%2==0) {
				System.out.println("Even : "+i);
			}
		}
	}
}
class ThreadTest2 extends Thread{
	@Override
	public void run() {
		
		for(int i=11;i<=22;i++) {
			if(i%2!=0) {
				System.out.println("Odd : "+i);
			}
		}
	}
}


