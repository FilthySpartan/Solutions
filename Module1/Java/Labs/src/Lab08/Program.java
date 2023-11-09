package Lab08;

public class Program {

    public static void main(String[] args) {
        
        Account acc1 = new Account(101, "Bilbo", 10000.00);
        Account myAccount = new Account(102, "Jim", 100.00);
        Account partnerAccount = myAccount;
        Account yourAccount = new Account(103, "Bim", 500.00);

        // part 3
        int k=100;
        incInt(k);
        System.out.println("K = " + k);
        processAccount(yourAccount);
        yourAccount.getDetails();

        // part 2
        myAccount.addInterest();
        myAccount.getDetails();
        partnerAccount.addInterest();
        myAccount.getDetails();
        partnerAccount.getDetails();

        // part 1
        acc1.getDetails();
        acc1.deposit(200.50);
        acc1.getDetails();
        acc1.withdraw(700.00);
        acc1.getDetails();

    }

    static void processAccount(Account acc){
         acc.addInterest();
    }

    private static void incInt(int x) {
        x++;
    }
}
