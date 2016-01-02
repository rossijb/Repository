import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		boolean Prime = true;

		for (int divNum = 2; divNum <= num / 2; divNum++) {
			if (num % divNum == 0) {
				System.out.println("The number is not prime!");

				Prime = false;
				break;
			}
		}
		if (Prime) {
			System.out.println("The number is prime!");

		}
	}

}
