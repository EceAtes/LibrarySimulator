import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userIn;
		String memberName,
			   bookName,
			   writerName,
			   targetName;
		Member newMember;
		Book newBook;
		char memberStatus,
			 isNewHold;
		int choice,
			memberCount,
			bookCount,
			publishingYear,
			targetIndex,
			holdDay,
			holdMonth,
			holdYear;
		ArrayList<Member> members;
		
		members = new ArrayList<>();
		
		userIn = new Scanner( System.in );
		
		
		do {
			displayMenu();
			
			System.out.print( "Enter choice: " );
			choice = userIn.nextInt();
			
			if( choice < 1 || choice > 5 ) {
				System.out.println( "Invalid choice - try again" );// Output error message
			}
			else if( choice == 1) {
				if( members.size() == 0 ) {
					System.out.println( "Currently there's no member" );
				}
				else {
					System.out.println( members );
				}
			}
			else if( choice == 2) {
				System.out.print( "How many new members will be added: " );
				memberCount = userIn.nextInt();
				
				for( int i = 0; i < memberCount; i++) {
					System.out.print( "Please enter member's name: " );
					memberName = userIn.next() + " " + userIn.next();
					
					System.out.print( "Please enter member's status( N, P, L ): " );
					memberStatus = userIn.next().charAt( 0 );
					
					newMember = new Member ( memberName, memberStatus);
					
					members.add(newMember);
					//trying
					}
			}
					
			else if( choice == 3) {
			   	for( int i = 0; i < members.size(); i++) {	
			   		System.out.println( members.get(i).getName() + "'s books: " );
			   		System.out.println( members.get(i).getBookList() + "\n" );
			   	}
			   		
			}
			
			else if( choice == 4) {
				System.out.print( "Member's name: " );
				targetName = userIn.nextLine();
				
				targetIndex = -1;
				
				do{
					for( int i = 0; i < members.size(); i++ ) {
				
						if( members.get(i).getName().equals( targetName )) {
							targetIndex = i;
						}
						
					}
					 userIn.nextLine();
					 
					if( targetIndex == -1 ) {
						System.out.printf( "Sorry, there's any member named %s. Try Again!\n", targetName );
						
						System.out.print( "Member's name: " );
						targetName = userIn.nextLine();
					}
					
				}while( targetIndex >= 0);
				
				System.out.print( "How many new books will be taken?: " );
				bookCount = userIn.nextInt();
				
				System.out.print( "Is this a previously taken book? (y/n) :  " );
				isNewHold = userIn.next().charAt(0);
				
				for( int i = 0; i < bookCount; i++) {
					System.out.print( "Please enter book's name: " );
					bookName = userIn.nextLine();
					
					System.out.print( "Please enter author's name: " );
					writerName = userIn.nextLine();
					
					System.out.print( "Please enter publishing year of the book: " );
					publishingYear = userIn.nextInt();
					
					if( isNewHold == 'n') {
						System.out.print( "Please enter the day the book was taken (DD MM YYYY) : " );
						holdDay = userIn.nextInt();
						holdMonth = userIn.nextInt();
						holdYear = userIn.nextInt();
						
						newBook = new Book( bookName, writerName, publishingYear, holdDay, holdMonth, holdYear );
						
					}
					else {
					newBook = new Book( bookName, writerName, publishingYear );
					}
					
					members.get( targetIndex ).getBookList().add( newBook );
					
					}   		
			}
			else {
				System.out.println( "Goodbye!" );
			}
			
		}while( choice != 5 );
		
		userIn.close();
	}


	public static void displayMenu() {
		System.out.print( "---------------MENU---------------\n" );
		System.out.println( "1. See current members \n2. Add new member(s) \n3. See the books members hold \n4. Hold new book(s) \n5. Quit " );//
	
	}

}
