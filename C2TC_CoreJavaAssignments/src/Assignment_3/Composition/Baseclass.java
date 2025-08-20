package Assignment_3.Composition;

public class Baseclass {
	protected int id;
    protected String title;

    public Baseclass(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void displayInfo() {
        System.out.print("ID: " + id + ", Title: " + title);
    }
    
    public String getTitle() {
		return title;
    	
    }
}

