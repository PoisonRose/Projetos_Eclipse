package src;

import java.security.MessageDigest;

public class gerarHash {
	public gerarHash() {
		
	}
	public static String gerarOHash(String senha) throws Exception {
		MessageDigest algorithm=MessageDigest.getInstance("SHA256");
		byte hash[] = algorithm.digest(senha.getBytes("UTF-8"));
		
		StringBuilder texto = new StringBuilder();
		for (byte b : hash) {
			texto.append(String.format("%02X", 0xFF & b));
		}
		return texto.toString();
	}
}
