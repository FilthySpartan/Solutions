package Lab08;

public class Account {
    private int id;
    private String owner;
    private double balance;

    public Account(int id, String owner, double balance) {
       this.id = id;
       this.owner = owner;
       this.balance = balance;
    }

    public void getDetails(){
        System.out.println("ID: " + this.id);
        System.out.println("Owner: " + this.owner);
        System.out.println("Balance: " + this.balance);
    }

    public void addInterest() {
        double interest = 2.5;  
        double interestAdded = (this.balance / 100) * interest;
        this.balance += interestAdded;     
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot deposit less than £0.01");
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot withdraw less than £0.01");
        } else if (amount > this.balance) {
            System.out.println("Cannot withdraw more than " + this.balance);
        }
        else {
            this.balance += amount;
        }
    }

}
