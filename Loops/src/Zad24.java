import java.util.Scanner;

public class Zad24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		int revNum = 0;
		int number = num;
		
		do {

			int digit = num % 10;
			revNum *= 10;
			revNum += digit;
			num /= 10;
			
		}while (num > 0);
		
		if (revNum == number) {
			System.out.println("The number is a palindrome!");
		} else {
			System.out.println("The number is not a palindrome!");

		}
	}

}
