import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Volume:");
		int vol = sc.nextInt();

		int bucket2 = 2;
		int bucket3 = 3;
		int bucket5 = bucket2 + bucket3;
		
		if (vol < 10 || vol > 9999) {
			System.out.println("Incorrect volume");
		} else {
			if (vol % bucket5 == 0) {
				int count = vol / bucket5;
				System.out.println(count + " ���� �� 2�.");
				System.out.println(count + " ���� �� 3�.");
			} else {
				if (vol % bucket5 == 4) {
					int count1 = vol / bucket5;
					System.out.println(count1 + " ���� �� 2�.");
					System.out.println(count1 + " ���� �� 3�.");
					System.out.println("������������ 2 ���� �� 2�.");
				} else {
					if (vol % bucket5 == 3) {
						int count2 = (vol / bucket5);
						System.out.println(count2 + " ���� �� 2�.");
						System.out.println(count2 + " ���� �� 3�.");
						System.out.println("������������ 1 ���� �� 3�.");
					} else {
						if (vol % bucket5 == 2) {
							int count3 = (vol / bucket5);
							System.out.println(count3 + " ���� �� 2�.");
							System.out.println(count3 + " ���� �� 3�.");
							System.out.println("������������ 1 ���� �� 2�.");
						} else {
							if (vol % bucket5 == 1) {
								int count4 = (vol / bucket5) - 1;
								int count5 = (vol / bucket5);
								System.out.println(count4 + " ���� �� 2�.");
								System.out.println(count5 + " ���� �� 3�.");
								System.out.println("������������ 1 ���� �� 3�.");
							}
						}
					}
				}
			}
		}
	}

}
