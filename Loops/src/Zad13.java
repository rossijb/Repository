import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum:");
		
		int sum = sc.nextInt();
		
		if (sum < 1 || sum > 27) {
			System.out.println("Invalid sum!");
		} else {

			for (int num = 100; num <= 999; num++) {
				int number = num;
				while (number > 0) {

					int digit3 = number % 10;
					number /= 10;
					int digit2 = number % 10;
					number /= 10;
					int digit1 = number % 10;
					number /= 10;

					if (digit3 + digit2 + digit1 != sum) {
						continue;
					}
					System.out.println(num);
				}
			}
		}
	}

}
