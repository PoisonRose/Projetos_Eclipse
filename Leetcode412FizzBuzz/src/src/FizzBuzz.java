package src;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
	public static List<String> fizzBuzz(int n) {
		List<String> answer = new ArrayList<>(n);
		
		for (int i=0;i<n;i++) {
			if(((i+1)%3==0)&&((i+1)%5==0)) {
				answer.add("FizzBuzz");
			}
			else if((i+1)%3==0){
				answer.add("Fizz");
			}
			else if((i+1)%5==0) {
				answer.add("Buzz");
			}
			else {
				answer.add(String.valueOf(i+1));
			}
		}
		
		return answer;
	}
}
