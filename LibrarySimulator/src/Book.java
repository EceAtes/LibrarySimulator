import  java.util.Arrays;
import java.util.Calendar;
public class Book {
	final private int INITIAL_DUE_DATE = 12;  
	
	private String bookName,
				   writer;
	private int pubYear;
	private int dueDay,
				dueMonth,
				dueYear;
	
	public Book( String bookName, String writer, int pubYear, int holdDay, int holdMonth, int holdYear) {
		this.bookName = bookName;
		this.writer = writer;
		this.pubYear = pubYear;
		this.dueDay = holdDay + INITIAL_DUE_DATE;
		this.dueMonth = holdMonth;
		this.dueYear = holdYear;
		
		if( dueDay > 30 ) {
			dueDay -= 30;
			dueMonth++;
		}
		
		if( dueMonth > 12) {
			dueMonth -= 12;
			dueYear++;
		}
	}
	
	public Book( String bookName, String writer, int pubYear ) {
		this.bookName = bookName;
		this.writer = writer;
		this.pubYear = pubYear;
		dueDay = Calendar.getInstance().get(Calendar.DATE) + INITIAL_DUE_DATE;
		dueMonth = Calendar.getInstance().get(Calendar.MONTH);
		dueYear = Calendar.getInstance().get(Calendar.YEAR);
		
		if( dueDay > 30 ) {
			dueDay -= 30;
			dueMonth++;
		}
		
		if( dueMonth > 12) {
			dueMonth -= 12;
			dueYear++;
		}
	}
	
	/**
	 * 
	 * @param bookName
	 */
	public void setBookName( String bookName) {
		this.bookName = bookName;
	}
	
	/**
	 * 
	 * @return book name
	 */
	public String getBookName() {
		return this.bookName;
	}
	
	/**
	 * trying
	 * @param bookName
	 */
	public void setWriter( String writer) {
		this.writer = writer;
	}
	
	/**
	 * 
	 * @return book name
	 */
	public String getWriter() {
		return this.writer;
	}
	
	/**
	 * 
	 * @param bookName
	 */
	public void setPubYear( int pubYear) {
		this.pubYear = pubYear;
	}
	
	/**
	 * 
	 * @return book name
	 */
	public int getPubYear() {
		return this.pubYear;
	}
	
	/**
	 * 
	 * @param bookName
	 */
	public void setDueDate( int dueDate[], int day, int month, int year) {
		dueDay = day;
		dueMonth = month;
		dueYear = year;
	}
	
	/**
	 * 
	 * @return book name
	 */
	public String getDueDate() {
		String output;
		
		output = dueDay + "/" + dueMonth + "/" + dueYear;
		
		return output;
	}
	
	public String toString() {
		String output;
		
		output = "Book name: " + this.bookName + " \nAuthor: " + this.writer + "\nPublished at: " + this.pubYear + "\nDue date: " + getDueDate();
	
		return output;
	}
	
	
}
