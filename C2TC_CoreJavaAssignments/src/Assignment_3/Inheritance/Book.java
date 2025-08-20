package Assignment_3.Inheritance;

public class Book extends Baseclass {
	
	private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: [ID: " + id + ", Title: " + title + ", Author: " + author + "]");
    }

    public String getAuthor() {
        return author;
    }
}
