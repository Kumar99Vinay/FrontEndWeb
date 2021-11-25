package java8features;

import java.net.URL;
import java.util.Base64;

public class Base64Test {

	public static void main(String[] args) {
		String msg="Welcome to the java 8 features";
		
		Base64.Encoder encoder=Base64.getEncoder();
		String encodedMsg=encoder.encodeToString(msg.getBytes());
		System.out.println("Encoded msg  "+encodedMsg);
		
		Base64.Decoder decoder=Base64.getDecoder();
		String decodedmsg=new String(decoder.decode(encodedMsg));
		System.out.println("Decoded msg "+decodedmsg);
		
		String url="https://www.neosofttech.com/";
		System.out.println(url);
		
		Base64.Encoder url_encoder=Base64.getUrlEncoder();
		String encodeurl=url_encoder.encodeToString(url.getBytes());
		System.out.println("Encoded url  "+encodeurl);
		
		Base64.Decoder url_decodert=Base64.getUrlDecoder();
		String decodedurl=new String(url_decodert.decode(encodeurl));
		System.out.println("Decoded url  "+decodedurl);
		
	


		
	}

}
