# LibrarySimulator
CS101 Project: Library Simulation
Assignment
Application should have minimum 2 classes (including the main class) and maximum 3 classes
Use at least one array/ArrayList.
Requirements
A traditional library will be simulated. There will be two types of actors, librarian and member.
Librarian shall be able to
Enter new members
Remove members
Enter new books
Remove books
Enter books a member is holding and their due dates
For each member, display books they are holding, due dates and debts
Member shall be able to display
Available books in the library
Names and due dates of books she is currently holding
Total debt to the library according to current and due dates of books
Design
A main class to add members and maybe librarians and books:
Add five members (?), one librarian, two VIP members ( one with debt, one without ), two regular members ( one with debt, one without ) 
Print their string representation


A Member class to add books to members and calculating debt according to the due dates of the books:
Variables:
Name variable
Status variable (librarian or member - vip member (?) - 
Create an arrayList of books they have, for each member, ask for book info with scanner (?) 
Current date variable
Debt variable

Methods:
Getter and setters for all variables except book list and current date
A method to calculate debt (0.5 for each day, for vip maybe 0.2 or something)
toString method to output name, status, booklist, current debt  

//maybe different constructors for members and librarians

A Book class to add books and their primary info (name, writer, publishing date):
Variables:
Book name 
Writer 
Publishing date 
Due date (entered with constructor, if not, presumed as taken newly set from 2 weeks from current date) 

Methods:
Getters and setters for all variables
???
toString with all variables 
