import java.util.Scanner;

//program 3 Sum of All Subset XOR Totals

public class Subset {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int no = sc.nextInt();

		int nums[] = new int[no];

		for (int k = 0; k < no; k++) {
			nums[k] = sc.nextInt();
		}

		int n = nums.length;
		int sum = 0;

		for (int subSet = 1; subSet < (1 << n); subSet++) {
			int xor = 0;
			for (int element = 0; element < n; ++element) {
				if ((subSet & (1 << element)) > 0) {
					xor = xor ^ nums[element];
				}
			}
			sum += xor;
		}

		System.out.println(sum);

	}

}
