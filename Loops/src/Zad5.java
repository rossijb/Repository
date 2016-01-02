import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въветете две числа:");

		int startNum = sc.nextInt();
		int endNum = sc.nextInt();
		
		if (startNum > endNum) {
			startNum = startNum + endNum;
			endNum = startNum - endNum;
			startNum = startNum - endNum;
		}	      	
		for (int num = startNum; num <= endNum; num++) {
			System.out.println(num);
		}
	}

}
