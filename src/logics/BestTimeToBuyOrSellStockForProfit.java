package logics;

public class BestTimeToBuyOrSellStockForProfit {

	public static void main(String[] args) {
		int[] in = {7,1,5,3,6,4}; //7,6,4,3,1
		findBestProfitToBuyOrSellStockForADay(in);
		findBestProfitToBuyOrSellStockForADayBruteForce(in);
	}

	private static void findBestProfitToBuyOrSellStockForADayBruteForce(int[] in) {
		if(in == null || in.length < 1) {
			System.out.println("0");
			return;
		}
		
		int maxProfit = 0;
		for(int i = 0; i < in.length; i++) {
			for(int j = i + 1; j < in.length; j++) {
				if(in[i] < in[j]) {
					int currentProfit = in[j] - in[i];
					maxProfit = Math.max(maxProfit, currentProfit);
				}
			}
		}
		
		System.out.println(maxProfit);
	}

	private static void findBestProfitToBuyOrSellStockForADay(int[] in) {
		if(in == null || in.length < 1) {
			System.out.println("0");
			return;
		}
		
		int left = 0, right = 1;
		int maxProfit = 0;
		
		while(right < in.length) {
			if(in[left] < in[right]) {
				int currentProfit = in[right] - in[left];
				maxProfit = Math.max(maxProfit, currentProfit);
			} else {
				left = right;
			}
			right++;
		}
		System.out.println("max profit: " + maxProfit);
	}

}
