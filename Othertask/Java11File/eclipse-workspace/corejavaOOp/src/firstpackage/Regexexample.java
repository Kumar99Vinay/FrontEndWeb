package firstpackage;
import java.util.regex.*;

public class Regexexample {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile(".a");
		Matcher matcher=pattern.matcher("ba");
		boolean result=matcher.matches();
		System.out.println(result);
		
		
		boolean res=Pattern.compile(".a").matcher("xba").matches();
		System.out.println(res);
		
		boolean rs=Pattern.matches(".x", "yx");
		System.out.println(rs);
		
		System.out.println(Pattern.matches("^\\+(?:[0-9]?){10}[0-9]$", "+91-9871183225"));
		System.out.println("\"^[+]{1}[\\\\d]{1,3}[-]{1}[0-9]{10}\"");

	}

}
