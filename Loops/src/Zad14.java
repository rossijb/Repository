import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		
		int num = sc.nextInt();

		if (num < 14 || num > 200) {
			System.out.println("Invalid number!");
		} else {

			for (int number = num; number >= 14; number--) {
				if (number % 7 != 0) {
					continue;
				}
				System.out.println(number);
			}
		}
	}

}
