import java.util.Scanner;

public class Zad21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter card number");
		int cardNum = sc.nextInt();
		for (int card = cardNum; card <= 52; card++) {
			int cardNumber = (card - 1) / 4 + 1;
			int cardSuit = card % 4;
			switch (cardNumber) {
			case 1:System.out.print("2 of ");break;
			case 2:System.out.print("3 of ");break;
			case 3:System.out.print("4 of ");break;
			case 4:System.out.print("5 of ");break;
			case 5:System.out.print("6 of ");break;
			case 6:System.out.print("7 of ");break;
			case 7:System.out.print("8 of ");break;
			case 8:System.out.print("9 of ");break;
			case 9:System.out.print("10 of ");break;
			case 10:System.out.print("\"J\" of ");break;
			case 11:System.out.print("\"D\" of ");break;
			case 12:System.out.print("\"K\" of ");break;
			case 13:System.out.print("\"A\" of ");break;
			}

			switch (cardSuit) {
			case 0:System.out.print("Clubs");break;
			case 1:System.out.print("Spades");break;
			case 2:System.out.print("Diamonds");break;
			case 3:System.out.print("Hearts");break;		
			}
			if(card < 52){
				System.out.print(", ");
			}
		}
	}

}
