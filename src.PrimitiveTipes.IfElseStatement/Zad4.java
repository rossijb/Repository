import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a<b) {
			System.out.println(a+ "\n" +b);
		}else {
			System.out.println(b+ "\n" +a);
		}
	}

}
