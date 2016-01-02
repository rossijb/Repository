import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете час:");
		int hour = sc.nextInt();

		if (hour < 0 || hour > 24) {
			System.out.println("Невалиден час!");
		} else {
			
				switch (hour) {
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					System.out.println("Добро утро!");
					break;
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
					System.out.println("Добър ден!");
					break;
				case 0:
				case 1:
				case 2:
				case 3:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:					
					System.out.println("Добър вечер!");
					break;
				
			}
		}
	}
}
