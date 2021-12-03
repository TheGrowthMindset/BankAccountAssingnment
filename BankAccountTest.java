public class BankAccountTest {

public static void main(String[] args) {

    BankAccount kendrick = new BankAccount(250000, 500000);
    BankAccount babyKeem = new BankAccount(50000, 25000);
    BankAccount sZa = new BankAccount(25000, 1000);
    

    // System.out.println(kendrick.getCheckingBalance());
    // System.out.println(babyKeem.getCheckingBalance());
    // System.out.println(sZa.getCheckingBalance());

    // System.out.format("\nTotal Savings: %s : " + "$" + kendrick.getSavingsBalance(), kendrick);
    // System.out.format("\nTotal Savings: %s: " + "$" + babyKeem.getSavingsBalance(), babyKeem);
    // System.out.format("\nTotal Savings: %s: " + "$" + sZa.getSavingsBalance(), sZa);

    System.out.println(sZa.takeFromsavings(20000));

}

}