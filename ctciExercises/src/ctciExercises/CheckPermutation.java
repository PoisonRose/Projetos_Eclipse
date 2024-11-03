package ctciExercises;

public class CheckPermutation {
	public static boolean checkPermutation(String palavra1, String palavra2) {
		String string1 = palavra1.toLowerCase();
		String string2 = palavra2.toLowerCase();
		
		if (string1.length()==string2.length()) {
			int contador=0;
			char[] vetor = string1.toCharArray();
			for (int i=0;i<string1.length();i++) {
				if (string2.indexOf(vetor[i])>=0) {
					contador=contador+1;
				}
			}
			if (contador==string1.length()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
