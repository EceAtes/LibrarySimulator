import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userIn;
		String memberName;
		char memberStatus;
		int memberCount,
			bookCount;
		
		userIn = new Scanner( System.in );
		
		System.out.print( "Please enter member count: " );
		memberCount = userIn.nextInt();
		
		for( int i = 0; i < memberCount; i++) {
			System.out.print( "Please enter member's name and status( N, P, L ): " );
			memberName = userIn.next() + userIn.next();
			memberStatus = userIn.next().charAt( 0 );
			
			System.out.print( "How many books this member have?: " );
			bookCount = userIn.nextInt();
		}
		
		userIn.close();
	}

}
