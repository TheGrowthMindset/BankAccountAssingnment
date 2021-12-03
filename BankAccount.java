public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int totalNumbAccounts = 0;
    private static int totalAmountInBank = 0;

    // Constructor
    public BankAccount(double checkingBal, double savingsBal) {
        this.checkingBalance = checkingBal;
        this.savingsBalance = savingsBal;
        totalNumbAccounts++;
    }

    // Setter for checking Balance
    public void setCheckingBalance(double checkingBal) {
        this.checkingBalance = checkingBal;
    }
    // Getter Method for users checking Balance
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // Setter for savings Balance
    public void setSavingsBalance(double savingsBal) {
        this.savingsBalance = savingsBal;
    }
        // Getter Method for users savings Balance
    public double getSavingsBalance() {
        return savingsBalance;
    }


    // Method for Deposit
    public void addToChecking(double deposit) {
        this.checkingBalance += deposit;
        this.totalAmountInBank += deposit;
    }
    // Method for Deposit
    public void addToSavings(double deposit) {
        this.savingsBalance += deposit;
        this.totalAmountInBank += deposit;
    }

     // Method for Withdrawals
     public void takeFromChecking(double widthdraw) {
         if(checkingBalance > widthdraw){
             this.checkingBalance -= widthdraw;
             this.totalAmountInBank -= widthdraw;
         } else {

            System.out.println("Insufficient Funds... $5.00 will be deducted from your account");
            this.checkingBalance -= 5;
        }
    }
     // Method for savings withdrawal
     public void takeFromSavings(double widthdraw) {
         if(savingsBalance > widthdraw) {
             this.savingsBalance -= widthdraw;
             this.totalAmountInBank -= widthdraw;
         } else {

             System.out.println("Insufficient Funds... $5.00 will be deducted from your account");
             this.savingsBalance -= 5;
         }
    }



    // Method to display TotalBalance of Bank Accounts
    public double totalBalanceOfBankAccounts() {
        return this.totalAmountInBank;
    }



}