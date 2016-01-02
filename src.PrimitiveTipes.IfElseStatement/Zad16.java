import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете трицифрено число:");

		int abc = sc.nextInt();

		if (abc < 100 || abc > 999) {
			System.out.println("Невалидно число!");
		} else {

			while (abc > 0) {

				int c = abc % 10;
				abc /= 10;
				int b = abc % 10;
				abc /= 10;
				int a = abc % 10;
				abc /= 10;

				if (a == b && b == c) {
					System.out.println("Цифрите са равни.");
				} else {
					if (a < b && b < c) {
						System.out.println("Цифрите са във възходящ ред.");
					} else {
						if (a > b && b > c) {
							System.out.println("Цифрите са в низходящ ред.");
						} else {
							System.out.println("Цифрите са ненаредени.");
						}
					}
				}
			}
		}
	}
}
