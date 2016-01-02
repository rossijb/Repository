import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");

		int n = sc.nextInt();

		int num = 0;
		int sum = 0;
		do {
			num++;
			sum += num;
			
		} while (num < n);
		System.out.println(sum);
	}

}
