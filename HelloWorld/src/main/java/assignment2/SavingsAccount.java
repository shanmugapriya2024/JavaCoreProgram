package assignment2;

public class SavingsAccount extends Account {

    public double accountBalance;
    @Override
    public double deposit ( int x){
        accountBalance = accountBalance+x;
        return accountBalance;
    }
    public double withdraw ( int y){
        accountBalance = accountBalance-y ;
        return accountBalance;
    }
}
