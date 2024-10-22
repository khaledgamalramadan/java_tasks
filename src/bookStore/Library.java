package bookStore;
import java.util.ArrayList;

public class Library {
	
	private ArrayList <Book> myBooks = new ArrayList <Book> ();
	
	public void add_New_book(Book book) {
		myBooks.add(book);
		System.out.println("Book added: " + book.getTitle());

	}
	
	public void removeBook(String BookName) {
        for (Book book : myBooks) {
            if (book.getISBN().equals(BookName) || book.getTitle().equals(BookName)) {
            	
            	myBooks.remove(book);
            	System.out.println("Book removed: " + book.getTitle());
            	
                return;
            }
        }
        
        System.out.println("Book with " + BookName + " not found.");
	}

	
	public void displayBooks() {
		
        if (myBooks.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : myBooks) {
                System.out.println(book.getTitle());
            }
        }
    }

}
