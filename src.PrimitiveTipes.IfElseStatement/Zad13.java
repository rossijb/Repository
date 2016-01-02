import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете температура:");
		int t = sc.nextInt();
		
		if (t < -100 || t > 100) {
			System.out.println("Невалидна температура.");
		} else {
			if (t >= -100 && t <= -20) {
				System.out.println("Ледено студено.");
			}
			if (t <= 0 && t > -20) {
				System.out.println("Студено.");
			}
			if (t < 15 && t > 0) {
				System.out.println("Хладно.");
			}
			if (t <= 25 && t >= 15) {
				System.out.println("Топло.");
			}
			if (t > 25 && t <= 100) {
				System.out.println("Горещо.");

			}

		}
	}
}
