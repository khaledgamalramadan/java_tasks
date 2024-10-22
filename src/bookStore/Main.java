package bookStore;

public class Main {

	public static void main(String[] args) {
		
		 Library library = new Library();

	        Book book1 = new Book("C++", "Osama Elzero", "12345");
	        Book book2 = new Book("java for Beginners", "Mohamed El Desouki ", "1984");
	        Book book3 = new Book("PHP","khaled","1012");
	        
	        
	        library.add_New_book(book1);
	        library.add_New_book(book2);
	        library.add_New_book(book3);

	        System.out.println("Books in library:");
	        library.displayBooks();

	        
	        library.removeBook("1012");
	        
	        System.out.println("Books in library after removal:");
	        library.displayBooks();

	}

}
