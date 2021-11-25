package secondpackage;
import firstpackage.*;

public class Mainclass {

	public static void main(String[] args) {
		Developer[] developers= {
				new Developer(101, "lila", 10, 10000, "java", "ecommerce"),
				new Developer(102, "rohan", 9, 12000, "php", "website"),
				new Developer(103,"abhi" ,12 , 9000, "android", "ecommerce"),
				};
		
		for(Developer dev : developers) {
			if(dev.salary < 10000) {
				dev.showid();
				dev.showprofile();
			}
		}

	}

}
