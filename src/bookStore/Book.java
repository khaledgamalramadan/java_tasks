package bookStore;

public class Book {
	private String title;
	private String auther;
	private String ISBN;
	
	
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.auther = author;
        this.ISBN = ISBN;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public String getTitle() {
        return title;
    }
    

    public void BookInfo() {
        System.out.println("Title:  " + title + ", Author:  " + auther + ", ISBN:  " + ISBN);
    }


}
