import java.util.Date;
import java.time.Month;
import java.time.LocalDate;

class Lab6_4 {

	public static void
	getDayMonthYear(String date)
	{

		LocalDate currentDate
			= LocalDate.parse(date);

		int day = currentDate.getDayOfMonth();

		Month month = currentDate.getMonth();

		int year = currentDate.getYear();

		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}

	public static void main(String args[])
	{
		
		String date = "2022-02-11";

		getDayMonthYear(date);
	}
}
