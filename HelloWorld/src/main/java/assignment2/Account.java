package assignment2;

public class Account  {
    public int accountNumber = 12345373;
    public double accountBal = 10000.00;

    public double deposit( int x )
    {
         return x;
    }
    public double withdraw( int y ){
        return y;
    }

    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount();
        System.out.println("Checking Deposit :" + c.deposit(5000));
        System.out.println("Checking Withdraw :" + c.withdraw(3000));

        SavingsAccount s = new SavingsAccount();
        System.out.println("Savings Deposit :" + s.deposit(7000));
        System.out.println("Savings Withdraw:"  + s.withdraw(3000) );
    }

}

