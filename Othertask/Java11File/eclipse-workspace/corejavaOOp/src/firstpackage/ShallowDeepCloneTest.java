package firstpackage;

import java.util.Arrays;

public class ShallowDeepCloneTest {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		Shallow s=new Shallow(a);
		s.showdata();
		a[0]=100;
		s.showdata();
		System.out.println("==================================");
		
		Deep d=new Deep(a);
		d.showdata();
		a[0]=500;
		d.showdata();
		
		
		

	}

}

class Shallow{
	private int[] data;
	public Shallow(int[] data1) {
		data=data1;
	}
	public void showdata() {
		System.out.println(Arrays.toString(data));
	}
	
}

class Deep{
	private int[] data;
	public Deep(int[] data1) {  //object creation like IPhone13 iPhone13_1=(IPhone13) iphone13.clone();
		data=new int[data1.length];
		for(int i=0;i<data.length;i++) {
			data[i]=data1[i];
		}
	}
	public void showdata() {
		System.out.println(Arrays.toString(data));
	}
	
}