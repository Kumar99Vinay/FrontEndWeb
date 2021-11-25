package firstpackage;

public class SynchronizationDemo extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Name: " + this.getName());
		System.out.println("Holds Lock? " + this.holdsLock(this)); // false

		synchronized (this) {
			System.out.println("Holds Lock? " + this.holdsLock(this)); // true
		}
	}

	public static void main(String[] args) {
//		SyncroThreadTest thread = new SyncroThreadTest();
//		thread.start();

		Printer printer = new Printer();
		
		new PC1(printer).start();
		new PC2(printer).start();
	}


}

class Printer {
	//synchronized 
	void doPrint(String doc) {

		System.out.println("Non synch area....");

		synchronized(this){

			for (int i = 1; i <= 10; i++) {
				System.out.println("Printing " + doc + ":" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Non synch area....");
	}
}

class PC1 extends Thread {
	
	Printer p;
	
	public PC1(Printer p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		p.doPrint("Java");
	}
}

class PC2 extends Thread {
	
	Printer p;
	
	public PC2(Printer p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		p.doPrint("Python");
	}
}
