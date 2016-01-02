import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");

		int smallerNum = sc.nextInt();
		int biggerNum = sc.nextInt();

		if ((smallerNum < 10 || smallerNum > 5555) || (biggerNum < 10 || biggerNum > 5555)) {
			System.out.println("Invalid number!");
		}else {
			if (smallerNum > biggerNum) {
				smallerNum = smallerNum + biggerNum;
				biggerNum = smallerNum - biggerNum;
				smallerNum = smallerNum - biggerNum;
			}
				for (int num = biggerNum; num >= smallerNum; num--) {
					if (num % 50 != 0) {
						continue;
					}
					System.out.print(num + ", ");
				
			}
		}
	}

}
