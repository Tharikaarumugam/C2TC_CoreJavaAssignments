package Assignment_3;

import java.util.ArrayList;
import java.util.List;


public class Library {
	
	private List<Baseclass> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Baseclass item) {
        items.add(item);
    }

    public void showAllItems() {
        System.out.println("Library contains:");
        for (Baseclass item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            } else if (item instanceof Magazine) {
                Magazine mag = (Magazine) item;
                System.out.println("- " + mag.getTitle() + " Issue " + mag.getIssueNumber());
            } else {
                System.out.println("- " + item.getTitle());
            }
        }
    }

	public void addBaseclass(Book book) {
		items.add(book);
			
	}

	public void addMagazine(Magazine magazine) {
		 items.add(magazine);
		
	}

}
