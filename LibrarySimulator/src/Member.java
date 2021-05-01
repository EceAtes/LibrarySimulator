import java.util.ArrayList;
import java.util.Calendar;

public class Member {
	final private double DEBT_RATE_REGULAR = 0.5,
						 DEBT_RATE_ADVANCED = 0.3;
	
	
	private String name;
	private char status;// N for regular member, P for advanced membership, L for librarian
	private ArrayList<Book> books;
	private int debt;
	
	public Member( String name, char status, ArrayList<Book> books ) {
		this.name = name;
		this.status = status;
		if( calculateTotalDebt() >  0 ) {
			this.debt = calculateTotalDebt();
		}
	}
	
	/**
	 * 
	 * @param bookName
	 */
	public void setBookName( String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return book name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 
	 * @param bookName
	 */
	public void setStatus( char status) {
		this.status = status;
	}
	
	/**
	 * 
	 * @return book name
	 */
	public char getStatus() {
		return this.status;
	}
	
	public double calculateTotalDebt( ArrayList<Book> books ) {
		int currentDay, 
			currentMonth,
			currentYear,
			dueDay,
			dueMonth,
			dueYear,
			overDueDay,
			overDueMonth,
			overDueYear;
		double totalDebt;
	
		currentDay = Calendar.getInstance().get(Calendar.DATE);
		currentMonth = Calendar.getInstance().get(Calendar.MONTH);
		currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		totalDebt = 0;
		
		for( int i = 0; i < books.size(); i++) {
			dueDay = books.get[i].getDueDate;
			dueMonth = books.get[i].getDueDate;
			dueYear = books.get[i].getDueDate;
			
			//calculate differnce as days
			overDueDay += ( overDueMonth * 30 ) + ( overDueYear * 360 ); 
			
			if( status == 'P' ) {
				totalDebt = overDueDay * DEBT_RATE_ADVANCED;
			}
			else {
				totalDebt = overDueDay * DEBT_RATE_REGULAR;
			}
		}
	}
	
	public void toString() {
		
	}
	
	
	
}
