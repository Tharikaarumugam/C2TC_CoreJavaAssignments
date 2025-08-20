package Assignment_3.Inheritance;

public class Magazine extends Baseclass {
	
	 private int issueNumber;

	    public Magazine(int id, String title, int issueNumber) {
	        super(id, title);
	        this.issueNumber = issueNumber;
	    }

	    @Override
	    public void displayInfo() {
	        System.out.println("Magazine: [ID: " + id + ", Title: " + title + ", Issue: " + issueNumber + "]");
	    }

	    public int getIssueNumber() {
	        return issueNumber;
	    }

}
