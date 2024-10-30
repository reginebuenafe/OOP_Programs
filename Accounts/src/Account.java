public class Account {
    private String accountName;
    private int accountNumber;
    private double currentBalance;
    private double availableBalance;


    public Account(String accountName, int accountNumber, double currentBalance, double availableBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        this.availableBalance = availableBalance;
    }

    public boolean deposit(double amount){
        if(amount > 0 && amount % 100 == 0){
            this.currentBalance += amount;
            this.availableBalance += amount;
            return true;
        }else{
            return false;
        }
    }

    public boolean withdraw(double amount){
        int fee = 10;
        amount += fee;
        if(amount > 0 && amount % 100 == 0 && this.currentBalance >= amount){
            this.currentBalance -= amount;
            this.availableBalance -= amount;
            return true;
        }else{
            System.out.println("Sorry, your account doesn't have enough balance to make this transaction.");
            return false;
        }
    }

    public double checkBalance(){
        return this.availableBalance;
    }

    public boolean transfer (double amount, Account otherAccount){
        if(amount > 0 && amount % 100 == 0 && this.currentBalance >= amount){
            withdraw(amount);
            otherAccount.deposit(amount);
            return true;
        }else{
            return false;
        }
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nAccount Name: " + accountName +
                "\nCurrent Balance: $" + currentBalance +
                "\nAvailable Balance: $" + availableBalance;
    }
}
