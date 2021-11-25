package java8features;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		String str[] = new String[3];
		str[2] = "welcome";

		Optional<String> checkNull = Optional.ofNullable(str[2]);
		if (checkNull.isPresent())
			System.out.println(str[2].length());
		else
			System.out.println("Valuse is not present");
		
		//lamda expression way
		//Optional.ofNullable(str[2]).ifPresent(s -> System.out.println(s.toUpperCase()));
		

	}

}
