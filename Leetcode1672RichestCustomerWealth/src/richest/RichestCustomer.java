package richest;

public class RichestCustomer {
	public int maximumWealth(int[][] accounts) {
		int maximumWealth=0;
		int wealthPerCustomer[] = new int[accounts.length];
		for(int i=0;i<accounts.length;i++) {
			int customerWealth = 0;
			for(int j = 0;j<accounts[i].length;j++) {
				customerWealth = customerWealth+accounts[i][j];
			}
			wealthPerCustomer[i]=customerWealth;
		}
		for(int i=0;i<wealthPerCustomer.length;i++) {
			if(wealthPerCustomer[i]>maximumWealth) {
				maximumWealth=wealthPerCustomer[i];
			}
		}
		return maximumWealth;
	}
}
