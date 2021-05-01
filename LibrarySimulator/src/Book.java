import  java.util.Arrays;
import java.util.Calendar;
public class Book {
	private String bookName,
				   writer;
	private int pubYear;
	private int dueDay,
				dueMonth,
				dueYear;
	
	public Book( String bookName, String writer, int pubYear, int dueDay, int dueMonth, int dueYear) {
		this.bookName = bookName;
		this.writer = writer;
		this.pubYear = pubYear;
		this.dueDay = dueDay;
		this.dueMonth = dueMonth;
		this.dueYear = dueYear;
	}
	
	public Book( String bookName, String writer, int pubYear ) {
		this.bookName = bookName;
		this.writer = writer;
		this.pubYear = pubYear;
		dueDay = Calendar.getInstance().get(Calendar.DATE);
		dueMonth = Calendar.getInstance().get(Calendar.MONTH);
		dueYear = Calendar.getInstance().get(Calendar.YEAR);
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
	 * 
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
	
	
}
