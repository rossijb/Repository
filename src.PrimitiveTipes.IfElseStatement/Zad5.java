import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a, b and c:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int sth;

		if (b < a){
		     sth = b;
		     b = a;
		     a = sth;
		}
		if (c < b){
		     sth = c;
		     c = b;
		     b = sth;
		}
		if (b < a){
		     sth = b;
		     b = a;
		     a = sth;
		}
		  System.out.println(c);
		  System.out.println(b);
		  System.out.println(a);		 
	
	}

}
