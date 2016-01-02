import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въветете числo височина на триъгълника:");

		int height = sc.nextInt();
		int numOfSpace = height * 2;
		for (int row = 1; row < numOfSpace; row += 2) {
			for (int space = 0; space < (numOfSpace - row / 2); space++) {
				System.out.print(" ");
			}
			for (int col = 0; col < row; col++) {
				System.out.print("*");

			}
			System.out.println();
		
		}
	}

}