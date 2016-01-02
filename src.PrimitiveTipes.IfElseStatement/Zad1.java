import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A, B");
	double A = sc.nextDouble();
	double B = sc.nextDouble();
	System.out.println("Enter C");
	double C = sc.nextDouble();
	if (A<C && C<B){
	System.out.println(C + " е между " + A + " и " + B);	
	}else{
	System.out.println(C + " не е между " + A + " и " + B);	
	}
	
	}

}
