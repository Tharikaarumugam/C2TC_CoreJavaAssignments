package Assignment_3.Composition;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Baseclass> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void showAllItems() {
        System.out.print("Library contains: [");

        for (int i = 0; i < items.size(); i++) {
            Baseclass item = items.get(i);

            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.print(book.getTitle() + " by " + book.getAuthor());
            } else if (item instanceof Magazine) {
                Magazine mag = (Magazine) item;
                System.out.print(mag.getTitle() + " Issue " + mag.getIssueNumber());
            } else {
                System.out.print(item.getTitle());
            }

            if (i < items.size() - 1) {
                System.out.print(" - ");
            }
        }

        System.out.println(" ]");
    }

	public void addBaseclass(Book book) {
		
		items.add(book);
	
	}

	public void addMagazine(Magazine magazine) {
		
		items.add(magazine);
		
	}

}
