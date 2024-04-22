package assignment2;

public class CheckingAccount extends Account {

    public double accountBal;

    @Override
    public double deposit ( int x){
        accountBal = accountBal+x;
        return accountBal;
    }
     public double withdraw ( int y){
         accountBal = accountBal-y ;
        return accountBal;
     }

}
