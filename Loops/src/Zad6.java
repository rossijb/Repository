import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����o:");

		int n = sc.nextInt();
		
		int sum = 0;
		for (int num = 1; num <= n; num++) {		
			sum += num;
		}	
			System.out.println("����� �� ������ ����� �� ���������� � ����� �� " + sum);
				
	}
}