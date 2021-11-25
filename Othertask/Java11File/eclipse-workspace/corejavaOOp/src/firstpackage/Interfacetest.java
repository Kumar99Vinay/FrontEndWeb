package firstpackage;

public class Interfacetest {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.move();
		System.out.println(v.isMovable());
		System.out.println(v.isRollable());

	}

}

interface Movable{
	int AVERAGE_SPEED=50;//public final static
	public void move();
	boolean isMovable();
}

interface Rollable{
	boolean isRollable();
}

class Vehicle implements Movable,Rollable{
	public void move() {
		System.out.println(AVERAGE_SPEED);
	}
	public boolean isMovable() {
		return true;
	}
	public boolean isRollable() {
		return true;
	}
}
