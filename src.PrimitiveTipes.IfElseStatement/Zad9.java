import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 two digit numbers:");

		int a = sc.nextInt();
		int b = sc.nextInt();

		int pro = a * b;

		int digit = pro % 10;

		if (digit == 0) {
			System.out.println(pro + " e четно, " + digit + " не е нито четно нито нечетно");
		} else {
			if (digit % 2 == 0) {
				System.out.println(pro + " и " + digit + " са четни");
			} else {
				System.out.println(pro + " и " + digit + " нe са четни");
			}
		}

	}

}
