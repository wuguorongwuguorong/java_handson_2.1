
class Book{
    private String title;
    private int numberOfPages;
    private double cost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
}

public class Main
{
	public static void main(String[] args) {
		BankAccount a = new BankAccount();
        System.out.println(a.getFirstName() + a.getLastName() + a.getBalance());
	}
}