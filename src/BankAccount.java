public class BankAccount {
    int balance;
    int minBal, maxBal;
    BankAccount( int initialBalance )
    {
        balance = initialBalance;
    }
    public int getBalance()
    {
        return balance;
    }
    public void updateBalance( int newBalance )
    {
        if (newBalance < minBal) {
            minBal = newBalance;
        }
        if (newBalance > maxBal) {
            maxBal = newBalance;
        }
        balance = newBalance;
    }
    public int getMin()
    {
        return minBal;
    }
    public int getMax()
    {
        return maxBal;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount( 10 );
        b.updateBalance( 20 );
        b.updateBalance( 5 );
        System.out.println( "" + b.getMin() + " " + b.getMax() );
        System.out.println("should print out 5 20");
        BankAccount c = new BankAccount( 10 );
        c.updateBalance( 2 );
        c.updateBalance( 5 );
        System.out.println( "" + c.getMin() + " " + c.getMax() );
        System.out.println("should print out 2 10");
    }
}