package src;

import java.security.SecureRandom;

public class placeholder {

	public static void main(String[] args) throws Exception {
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		int randomInt = secureRandom.nextInt();
		long randomLong = secureRandom.nextLong();
		float randomFloat = secureRandom.nextFloat();
		double randomDouble = secureRandom.nextDouble();
		boolean randomBoolean = secureRandom.nextBoolean();
		
		System.out.println("randomInt: "+randomInt);
		System.out.println("randomLong: "+randomLong);
		System.out.println("randomFloat: "+randomFloat);
		System.out.println("randomDouble: "+randomDouble);
		System.out.println("randomBoolean: "+randomBoolean);

	}

}
