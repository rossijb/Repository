import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");

		int numA = sc.nextInt();
		int numB = sc.nextInt();

		if (numA > numB) {
			numA = numA + numB;
			numB = numA - numB;
			numA = numA - numB;
		}		
		int sqareNum = 0;
		int sumDegree = 0;
		for (int num = numA; num <= numB; num++) {
			sqareNum = num * num;		
						
			if (sqareNum % 3 == 0) {
				int skip = sqareNum;
				System.out.print("\"Skip" + skip + "\", ");
				continue;
			}
			System.out.print(sqareNum + ", ");
			sumDegree += sqareNum;	
			if (sumDegree > 200) {	
				break;
			}
			
		}
	}
}
