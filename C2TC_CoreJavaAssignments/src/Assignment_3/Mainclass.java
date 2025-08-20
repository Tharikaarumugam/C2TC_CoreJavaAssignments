package Assignment_3;

import Assignment_3.Library;

public class Mainclass {
	
	 public static void main(String[] args) {
	        
	        Book book = new Book(101, "Java Basics", "James Gosling");
	        Magazine magazine = new Magazine(201, "Tech Today", 45);

	    
	        book.displayInfo();
	        magazine.displayInfo();

	      
	        Library library = new Library();
	        library.addBaseclass(book);
	        library.addMagazine(magazine);

	        library.showAllItems();
	    }
}
