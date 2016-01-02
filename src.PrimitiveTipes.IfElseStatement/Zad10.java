import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Volume:");
		int vol = sc.nextInt();

		int bucket2 = 2;
		int bucket3 = 3;
		int bucket5 = bucket2 + bucket3;
		
		if (vol < 10 || vol > 9999) {
			System.out.println("Incorrect volume");
		} else {
			if (vol % bucket5 == 0) {
				int count = vol / bucket5;
				System.out.println(count + " пъти по 2л.");
				System.out.println(count + " пъти по 3л.");
			} else {
				if (vol % bucket5 == 4) {
					int count1 = vol / bucket5;
					System.out.println(count1 + " пъти по 2л.");
					System.out.println(count1 + " пъти по 3л.");
					System.out.println("Допълнително 2 кофи по 2л.");
				} else {
					if (vol % bucket5 == 3) {
						int count2 = (vol / bucket5);
						System.out.println(count2 + " пъти по 2л.");
						System.out.println(count2 + " пъти по 3л.");
						System.out.println("Допълнително 1 кофи от 3л.");
					} else {
						if (vol % bucket5 == 2) {
							int count3 = (vol / bucket5);
							System.out.println(count3 + " пъти по 2л.");
							System.out.println(count3 + " пъти по 3л.");
							System.out.println("Допълнително 1 кофа от 2л.");
						} else {
							if (vol % bucket5 == 1) {
								int count4 = (vol / bucket5) - 1;
								int count5 = (vol / bucket5);
								System.out.println(count4 + " пъти по 2л.");
								System.out.println(count5 + " пъти по 3л.");
								System.out.println("Допълнително 1 кофа от 3л.");
							}
						}
					}
				}
			}
		}
	}

}
