import java.util.Scanner;

public class Zad2_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int suma = x+y;
		int razlika = x-y;
		int proizvedenie = x*y;
		int delenie = x/y;
		int ostatyk = x%y;
	
		System.out.println("x+y= " +suma);
		System.out.println("x-y= " +razlika);
		System.out.println("x*y= " +proizvedenie);
		System.out.println("x/y= " +delenie);
		System.out.println("x%y= " +ostatyk);

	}

}
