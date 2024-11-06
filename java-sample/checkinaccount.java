public class checkinaccount extends BankAccount {
    private double overdraftLimit;

    public checkinaccount(){
        super();
        overdraftLimit = 2500;
    }
    
    public void setOverDraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverDraftLimit(){
        return overdraftLimit;
    }
    public void withdraw(double amount){
        if(getBalance() - amount > overdraftLimit){
            setBalance(getBalance()-amount);
        }
    }
    
}
