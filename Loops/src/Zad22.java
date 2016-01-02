import java.util.Scanner;

public class Zad22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		int count = 0;

		while (count < 10) {
			num++;

			if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
				continue;
			}
			count++;
			System.out.print(count + ":" + num + ", ");
		}
	}

}
