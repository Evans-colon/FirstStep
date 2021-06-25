package ChapterFour;

public class CreditLimitCalculator {
    private int accountNumber;
    private int balance;
    private int creditChargePositive;
    private int creditLimit;
    private int creditExpensesAppliedByCustomer;


    public CreditLimitCalculator(int accountNumber, int balance, int creditChargePositive, int creditLimit, int creditExpensesAppliedByCustomer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creditChargePositive = creditChargePositive;
        this.creditLimit = creditLimit;
        this.creditExpensesAppliedByCustomer = creditExpensesAppliedByCustomer;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance > 0)
            balance = balance + creditChargePositive - creditExpensesAppliedByCustomer;
        if(balance < creditLimit)
        this.balance = balance;
    }

    public int getCreditChargePositive() {
        return creditChargePositive;
    }

    public void setCreditChargePositive(int creditChargePositive) {
        this.creditChargePositive = creditChargePositive;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        if(creditLimit < creditExpensesAppliedByCustomer)
            System.out.println("credit limit exceeded");
        this.creditLimit = creditLimit;
    }

    public int getCreditExpensesAppliedByCustomer() {
        return creditExpensesAppliedByCustomer;
    }

    public void setCreditExpensesAppliedByCustomer(int creditExpensesAppliedByCustomer) {
        if(creditExpensesAppliedByCustomer > creditLimit)
            System.out.println("credit limit exceeded");
        this.creditExpensesAppliedByCustomer = creditExpensesAppliedByCustomer;
    }
}
