import java.util.Scanner;

public class ���11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number:");

		int num = sc.nextInt();
		int num2 = num;

		if (num == 0 || num > 999) {
			System.out.println("Invalid number");
		} else {

			while (num > 0) {

				int digit3 = num % 10;
				num /= 10;
				int digit2 = num % 10;
				num /= 10;
				int digit1 = num % 10;
				num /= 10;

				if (num2 % digit3 > 0) {
					System.out.println("������� �� �� ���� �� ���������� �� �����");
				} else {
					System.out.println("������� �� ���� �� ���������� �� �����");

					if (num2 % digit2 > 0) {
						System.out.println("������� �� �� ���� �� ������� �� �����");
					} else {
						System.out.println("������� �� ���� �� ������� �� �����");

						if (num2 % digit1 > 0) {
							System.out.println("������� �� �� ���� �� ������� �� �����");
						} else {
							System.out.println("������� �� ���� �� ������� �� �����");
						}
					}
				}
			}
		}
	}

}
