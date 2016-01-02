import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a four digit number:");
		int num = sc.nextInt();
		int newNum1 = 0;
		int newNum2 = 0;

		while (num > 0) {

			int digit4 = num % 10;
			num /= 10;
			int digit3 = num % 10;
			num /= 10;
			int digit2 = num % 10;
			num /= 10;
			int digit1 = num % 10;
			num /= 10;
			
			newNum1 *= 10;
			newNum1 += digit1;
			newNum1 *= 10;
			newNum1 += digit4;
			
			newNum2 *= 10;
			newNum2 += digit2;
			newNum2 *= 10;
			newNum2 += digit3;

			if (newNum1 == newNum2) {
				System.out.println("Числата са равни.");
			} else {

				if (newNum1 > newNum2) {
					System.out.println(newNum1 + " е по-голямо от " + newNum2);
				} else {
					System.out.println((newNum1 + " е по-малко от " + newNum2));
				}
			}
		}

	}

}
