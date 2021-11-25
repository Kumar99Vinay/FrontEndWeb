package java8features;

public class LamdaExpressionTest2 {

	public static void main(String[] args) {
		Runnable runnable=() -> {
			for(int i=1;i<=10;i++) {
				try {
					System.out.println(i+" ");
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(runnable).start();

	}

}
