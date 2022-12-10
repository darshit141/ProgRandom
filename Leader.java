import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leader {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(arr[n - 1]);
		int greatest = arr[n - 1];
		for(int i = n - 2; i >= 0; --i) {
			if(arr[i] > greatest)
			{
				greatest = arr[i];
				ans.add(greatest);
			}
		}
		
		for(int i = ans.size() - 1; i >= 0; --i) {
			System.out.print(ans.get(i) + " ");
		}
	}
}
