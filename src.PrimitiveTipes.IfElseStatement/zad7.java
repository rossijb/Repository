import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hour, cash and health:");

		int hour = sc.nextInt();
		double cash = sc.nextDouble();
		boolean health = sc.nextBoolean();

		boolean healthyKafe = ((health == true) && (cash < 10) && (cash > 0));
		boolean healthyKino = ((health == true) && (cash > 10));
		boolean notHealthyTea = ((health == false) && (cash < 0));
		boolean notHealthyMed = ((health == false) && (cash > 0));

		if (hour < 0 || hour > 24) {
			System.out.println("��������� ���!!!");

		} else {
			if (healthyKafe == true) {
				System.out.println("����� ���! �� ����� �� ����.");
			} else {
				if (healthyKino == true) {
					System.out.println("����� ���! �� ����� �� ����.");
				} else {
					if (notHealthyTea == true) {
						System.out.println("����� ���! �� ���� ����� � �� ��� ���.");
					} else {
						if (notHealthyMed == true) {
							System.out.println("����� ���! �� ����� �� �� ���� ���������.");
						} else {
							System.out.println("����� ���, �� ����� ����, �� �� ���� �����");
						}
					}
				}
			}

		}

	}

}
