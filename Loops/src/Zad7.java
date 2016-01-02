import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въветете числo n:");

		int n = sc.nextInt();
		int endNum = n*3;
		
		for (int counter = 3; counter <= endNum; counter += 3) {						
			System.out.print( counter + ", " );
		}	
	
	}

}
