package firstpackage;

public class AbstractclassTest {

	public static void main(String[] args) {
		Child d=new Child();
		d.show();
		d.showabstract();

	}

}
abstract class Abstractcheck{
	void show() {
		System.out.println("show");
	}
	abstract void showabstract();
	
}

class Child extends Abstractcheck{
	void showabstract() {
		System.out.println("done");
	}
}
