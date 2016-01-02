import java.util.Scanner;

public class Zad18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max value of factors:");

		int firstMaxFactor = sc.nextInt();
		int secondMaxFactor = sc.nextInt();
		
		if (firstMaxFactor < 1 || firstMaxFactor > 9 || secondMaxFactor < 1 || secondMaxFactor > 9) {
			System.out.println("Invalid factor!");
		} else {

			for (int firstFactor = 1; firstFactor <= firstMaxFactor; firstFactor++) {
				for (int secondFactor = 1; secondFactor <= secondMaxFactor; secondFactor++) {
					int product = firstFactor * secondFactor;

					System.out.println(firstFactor + "*" + secondFactor + " = " + product);
				}
			}
		}
	}

}
