package java8features;

interface Addition{
	public int add(int num1,int num2,int num3);
}

public class LamdaExpression {

	public static void main(String[] args) {
		String str="welcome";
		Addition s=(num1,num2,num3) -> {
			return num1+num2+num3;
		};
		System.out.println(s.add(2,3,4));
		
		System.out.println("============");
		LamdaExpression obj=new LamdaExpression();
		MathOperation add=(int a,int b) -> a+b;
		MathOperation sub=(int a,int b) -> a-b;
		MathOperation div=(int a,int b) -> a/b;
		MathOperation mult=(int a,int b) -> a*b;
		
		System.out.println("Addition"+obj.operate(100, 50, add));
		System.out.println("Subtraction"+obj.operate(100, 50, sub));
		System.out.println("Division"+obj.operate(100, 50, div));
		System.out.println("Multilication"+obj.operate(100, 50, mult));
		
		System.out.println("=========");
		
		System.out.println(add.operation(100, 50));
		System.out.println(sub.operation(100, 50));
		System.out.println(div.operation(100, 50));
		System.out.println(mult.operation(100, 50));
		

	}
	
	interface MathOperation{
		int operation(int a,int b);
	}
	
	private int operate(int a,int b,MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
