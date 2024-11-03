package src;

public class Solution2 {
	public static int[] sortedSquares(int[] nums) {
		
		int left=0;
		int right=nums.length-1;
		// Crie um novo array "solcucao" do mesmo tamanho que nums.
		int[] solucao = new int[nums.length];
		
		// Compare, pela mesma quantidade de vezes que o tamanho do vetor,
		// e começando pela última posição, o valor absoluto do elemento no endereço "left"
		// e o elemento no endereço "right", coloque o quadrado do maior no endereço "i" do vetor
		// e altere "left" e "right" de acordo. 
		for (int i=solucao.length-1;i>=0;i--) {
			if(Math.abs(nums[left])>Math.abs(nums[right])) {
				solucao[i]=nums[left]*nums[left];
				left++;
			}
			else {
				solucao[i]=nums[right]*nums[right];
				right--;
			}
		}
		return solucao;
	}
}
