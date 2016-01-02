
public class Zad12 {

	public static void main(String[] args) {

		for (int num = 100; num <= 999; num++) {
			int number = num;
			while (number > 0) {

				int digit3 = number % 10;
				number /= 10;
				int digit2 = number % 10;
				number /= 10;
				int digit1 = number % 10;
				number /= 10;

				if ((digit3 == digit2 || digit3 == digit1) || (digit2 == digit1))
					continue;
				System.out.println(num);

			}
		}
	}

}
