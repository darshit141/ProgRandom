import java.util.Scanner;

//program 2 best time to buy and sell Stocks

public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int prices[] = new int[len];

		for (int k = 0; k < len; k++) {
			prices[k] = sc.nextInt();
		}
		
		sc.close();
		
		int maxProfit = 0;
		int min = prices[0];
		
		for (int i = 1; i < prices.length; ++i) {
			if (prices[i] < min) {
				min = prices[i];
				continue;
			}
			maxProfit = Math.max(maxProfit, prices[i] - min);
		}
		System.out.println(maxProfit);

	}

}
