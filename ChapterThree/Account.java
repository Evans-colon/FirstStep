package ChapterThree;

public class Account {
    private String name;
    private int balance;



    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int deposit(int depositAmount) {
        int deposit = 0;
        if (balance >= 0) {
            balance = balance + deposit;
        }

        return balance;
    }

    public void withdrawal(int amount){
        if(amount > balance) {
            System.out.println("insufficient fund");
        } else {
        if(balance > amount){
            balance = balance - amount;
            System.out.println(balance);
            }
        }
    }

}
