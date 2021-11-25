package firstpackage;

public class Threadmethod {
	public void run(){
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+"In control");
		}
		
	}

	public static void main(String[] args) {
		

	}

}
