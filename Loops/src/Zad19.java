import java.util.Scanner;

public class Zad19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		
		int num = sc.nextInt();
		
		while (num > 1) {
			
			if (num % 2 == 0) {
				num *= 0.5;
			} else {
				num = (num * 3) + 1;				
			}
			System.out.print(num + " ");
		}
	}
} 

