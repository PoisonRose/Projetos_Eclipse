package src;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class gerarSalt {
	
	public static byte[] gerarSalt() throws NoSuchAlgorithmException{
		SecureRandom random = new SecureRandom();
		byte[] sal = new byte[16];
		random.nextBytes(sal);
		System.out.println(sal);
		return sal;
	}
}
