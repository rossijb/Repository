
public class Zad20 {

	public static void main(String[] args) {

		int numInRow = 0;
		
		for (int row = 0; row <= 9; row++) {
			numInRow++;	
			for (int col = 0; col <= 9; col++) {
				
				if (numInRow > 9)
					numInRow = 0;
				
				System.out.print(numInRow);
				numInRow++;
			}
			System.out.println();

		}
	}
}