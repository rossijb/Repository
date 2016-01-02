
public class Zad23 {

	public static void main(String[] args) {

		int row = 1;
		int col = 1;
		
		while (row <= 9) {
			while (col <= 9) {
				System.out.print(row + "*" + col + "; ");
				col++;
			}
			System.out.println();
			row++;
			col = row;
		}
	}

}
