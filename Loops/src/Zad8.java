import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въветете числo n:");

		int n = sc.nextInt();
		
		for (int row = n - 1; row <= (n - 1)*3; row += 2) {
			for (int col = 0; col < n; col ++) {
				System.out.print(row);
		}
			System.out.println();
		}
	}

}
