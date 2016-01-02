import java.util.Scanner;

public class zad12p {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете ден: ");
		int day = sc.nextInt();
		System.out.println("Въведете месец: ");
		int month = sc.nextInt();
		System.out.println("Въведете година: ");
		int year = sc.nextInt();

		boolean leapYеar = (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0));

		boolean correctData = true;
		if (day < 0 || day > 31) {
			correctData = false;
		} else if (month < 0 || month > 12) {
			correctData = false;
		} else if (year < 0) {
			correctData = false;
		} else if (day == 29 && month == 2 && !leapYеar) {
			correctData = false;
		}

		int numOfMonths = 12;
		int daysInMonth = 31;

		if ((month % 2 == 0 && month <= 7) || (month % 2 == 1 && month > 7)) {
			daysInMonth = 30;
		}

		if (month == 2) {
			daysInMonth = 28;
			if (leapYеar) {
				daysInMonth++;
			}
		}
		if ((day == 31 && daysInMonth == 30) ||
		   ((day == 30 || day == 31) && daysInMonth == 29)) {
			correctData = false;
		}
		if ((day == 30 && daysInMonth == 31) ||
			(day == 29 && daysInMonth == 30) ||
			(day == 28 && daysInMonth == 29) ||
			(day == 27 && daysInMonth == 28)) {
			daysInMonth += day;
		}
		if ((day == 30 && month == 11) || (day == 30 && month == 12)) {
			numOfMonths += month;
		}
		day++;
		month += day / daysInMonth;
		day %= daysInMonth;
		year += month / numOfMonths;
		month %= numOfMonths;

		if (correctData) {
			System.out.println("Следващата дата е");
			System.out.println(day + "." + month + "." + year);
		} else {

			System.out.println("Невалидна дата");

		}
	}
}
