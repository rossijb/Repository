import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� �����������:");
		int t = sc.nextInt();
		
		if (t < -100 || t > 100) {
			System.out.println("��������� �����������.");
		} else {
			if (t >= -100 && t <= -20) {
				System.out.println("������ �������.");
			}
			if (t <= 0 && t > -20) {
				System.out.println("�������.");
			}
			if (t < 15 && t > 0) {
				System.out.println("������.");
			}
			if (t <= 25 && t >= 15) {
				System.out.println("�����.");
			}
			if (t > 25 && t <= 100) {
				System.out.println("������.");

			}

		}
	}
}
