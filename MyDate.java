/*******************************************
*                MyDate                    *
*------------------------------------------*
* -year: int                               *
* -month: int                              *
* -day: int                                *
* +MyDate()                                *
* +MyDate(elapsedTime: long)               *
* +MyDate(year: int, month: int, day: int) *
* +getYear(): int                          *
* +getMonth(): int                         *
* +getDay(): int                           *
* +setDate(elapsedTime: long)              *
*******************************************/

// Use GregorianCalendar 
import java.util.GregorianCalendar;


// Class MyDate
public class MyDate {

	private int year;
	private int month;
	private int day;

	// Create new MyDate Obj from current date
	MyDate() {
		GregorianCalendar newCalander = new GregorianCalendar();
		year = newCalander.get(GregorianCalendar.YEAR);
		month = newCalander.get(GregorianCalendar.MONTH);
		day = newCalander.get(GregorianCalendar.DAY_OF_MONTH);
	}

	
	// Set Specific Elapsed Time
	MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}

	// Create MyDate Obj with specific date
	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// Return year
	public int getYear() {
		return year;
	}

	// Return month
	public String getMonth() {
		String m = String.valueOf(month + 1);
		return (month < 10 ? "0" + m : m);
	}

	// Return day
	public String getDay() {
		String d = String.valueOf(day);
		return (day < 10 ? "0" + d : d);
	}

	// Set date for obj using the elapsed time
	public void setDate(long elapsedTime) {
		GregorianCalendar newCalander = new GregorianCalendar();
		newCalander.setTimeInMillis(elapsedTime);
		year = newCalander.get(GregorianCalendar.YEAR);
		month = newCalander.get(GregorianCalendar.MONTH);
		day = newCalander.get(GregorianCalendar.DAY_OF_MONTH);
	} 
}