import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете координатите на първата позиция: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		System.out.println("Въведете координатите на втората позиция: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();						
			
			int sum1 = x1 + y1;
			int sum2 = x2 + y2;
			int sumColour = sum1 + sum2;
			
			boolean correctData = ((x1 < 0 || x1 > 8) || (x2 < 0 || x2 > 8) || (y1 < 0 || y1 > 8) || (y2 < 0 || y2 > 8));
			
			if (correctData) {
				System.out.println("Невалидни координати");
			} else {
			if (sumColour % 2 == 0) {
				System.out.println("Позициите са с еднакъв цвят.");
			} else {
				System.out.println("Позициите са с различен цвят.");
			}
		}
	}
}
