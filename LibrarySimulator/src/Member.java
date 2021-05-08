import java.util.ArrayList;
import java.util.Calendar;

public class Member {
	final private double DEBT_RATE_REGULAR = 0.5,
			     DEBT_RATE_ADVANCED = 0.3;
	final private int DAYS_IN_MONTH = 30,
			  DAYS_IN_YEAR = 360;
					  
	
	
	private String name;
	private char status;// N for regular member, P for advanced membership, L for librarian
	private ArrayList<Book> books;
	private double debt;
	
	public Member( String name, char status, ArrayList<Book> books ) {
		this.name = name;
		this.status = status;
	    this.debt = calculateTotalDebt( books );
		
	}
	
	public Member( String name, char status ) {
		this.name = name;
		this.status = status;
	    this.debt = 0;
		
	}
	
	/**
	 * trying
	 * @param bookName
	 */
	public void setName( String name) {
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
	
	public ArrayList<Book> getBookList(){
		return this.books;
	}
	
	public double calculateTotalDebt( ArrayList<Book> books ) {
		String dueDate;
		int currentDay, 
			currentMonth,
			currentYear,
			dueDay,
			dueMonth,
			dueYear,
			overDueDay,
			overDueMonth,
			overDueYear;
		double debtRate,
			   totalDebt;
	
		currentDay = Calendar.getInstance().get(Calendar.DATE);
		currentMonth = Calendar.getInstance().get(Calendar.MONTH);
		currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		totalDebt = 0;
		
		if( status == 'P' ) {
			debtRate = DEBT_RATE_ADVANCED;
		}
		else {
			debtRate = DEBT_RATE_REGULAR;
		}
		
		for( int i = 0; i < books.size(); i++) {
			dueDate = books.get(i).getDueDate(); 
			
			dueDay = Integer.parseInt( dueDate.substring(0,2) );
			dueMonth = Integer.parseInt( dueDate.substring(3,5) );
			dueYear = Integer.parseInt( dueDate.substring(6) );
			
			overDueDay = currentDay - dueDay;
			overDueMonth = currentMonth - dueMonth;
			overDueYear = currentYear - dueYear;
			
			overDueDay += ( overDueMonth * DAYS_IN_MONTH ) + ( overDueYear * DAYS_IN_YEAR ); 
			
			totalDebt = overDueDay * debtRate;
			
		}
		
		return totalDebt;
	}
	
	
	public String toString() {
		String output,
			   statusString;
		
		if( this.status == 'P') {
			statusString = "Advanced membership";
		}
		else if( this.status == 'N' ) {
			statusString = "Regular membership";
		}
		else {
			statusString = "Librarian";
		}
		
		output = "\nName: " + this.name + "\nMembership: " + statusString  + "\nCurrent debt: " + debt + "TL\n" + "Books currently holded: ";
		
		if( books == null ) {
			output += "There are no holded books.\n";
		}
		else {
			output += books;
		}
		
		return output;
 	}
	
	
	
}
