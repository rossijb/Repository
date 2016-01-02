import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y:");
		
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		
		double suma = x+y;
		double razlika = x-y;
		double proizvedenie = x*y;
		double delenie = x/y;
		double ostatyk = x%y;
		
		System.out.println("x+y= " +suma);
		System.out.println("x-y= " +razlika);
		System.out.println("x*y= " +proizvedenie);
		System.out.println("x/y= " +delenie);
		System.out.println("x%y= " +ostatyk);
		

	}

}
