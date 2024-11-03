package src;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Hash {

	public static void main(String[] argv) throws Exception {
		//String password="palavrasecreta";
		//MessageDigest algorithm = MessageDigest.getInstance("SHA256");
	//	byte[] hashPassword=algorithm.digest(password.getBytes("UTF-8"));
		//Scanner s = new Scanner(System.in);
		//System.out.println("Digite a senha:");
		//String senha=s.nextLine();
		//byte[] hashSenha=algorithm.digest(senha.getBytes("UTF-8"));
		//if (algorithm.isEqual(hashPassword, hashSenha)) {
			//System.out.println("Senha Correta!");
		//}
		//else {
			//System.out.println("Senha errada!");
		//}
		//s.close();
		//gerarHash teste = new gerarHash();
		//System.out.println(teste.gerarOHash("senha secreta"));
		gerarSalt salteste = new gerarSalt();
		salteste.gerarSalt();
	}
	
	

}
