package firstpackage;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		IPhone13 iphone13=new IPhone13(12, 5.2, 3.5);
		IPhone13 iPhone13_1=(IPhone13) iphone13.clone();
		IPhone13 iPhone13_2=(IPhone13) iphone13.clone();
		IPhone13 iPhone13_3=(IPhone13) iphone13.clone();
		IPhone13 iPhone13_4=(IPhone13) iphone13.clone();
		IPhone13 iPhone13_5=(IPhone13) iphone13.clone();
		System.out.println(iPhone13_4.height);

	}

}

class IPhone13 implements Cloneable{
	double weight;
	double height;
	double width;
	public IPhone13(double weight, double height, double width) {
		
		this.weight = weight;
		this.height = height;
		this.width = width;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
