

public class Main
{
	public static void main(String[] args) {
		BankAccount a = new BankAccount();
        a.setFirstName("Jon");
        a.setLastName("Snow");
        a.setBalance(500);
        System.out.println(a.setFirstName() + " " + a.setLastName() + " " + a.setBalance());

	}
}