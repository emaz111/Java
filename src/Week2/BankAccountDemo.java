package Week2;

/**
 * Created by u1859269 on 29/11/2018.
 */
public class BankAccountDemo {
    public static void main (String[] args) {

        BankAccount Account1 = new BankAccount ("1", "John Smith",0, false);

        Account1.setBalance(500.0);
        Account1.deposit(1200.0);
        Account1.addInterest(3);
        Account1.withdraw(230.0);

        System.out.println ("Account = " + Account1);


        }


    }
