package Week2;

/**
 * Created by u1859269 on 29/11/2018.
 */

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount (String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean deposit (double amount) {
        if (amount <= 0) {
            return false;
        } else {
            this.balance += amount;
            return true;
        }
    }

    public boolean withdraw (double amount) {
        if (amount <= 0) {
            return false;
        }
        else if (hasOverdraft) {
            this.balance += amount;
            return true;
        } else {
            this.balance += amount;
            return true;
        }
    }

    public boolean addInterest (int interestRate) {
        if (interestRate <= 0 && balance <=0)  {
            return false;
        } else {
            this.balance += this.balance * (interestRate / 100.0);
            return true;
        }

    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ("BankAccount{");
        sb.append ("accountNumber='").append (accountNumber).append ('\'');
        sb.append (", accountHolder='").append (accountHolder).append ('\'');
        sb.append (", balance=").append (balance);
        sb.append (", hasOverdraft=").append (hasOverdraft);
        sb.append ('}');
        return sb.toString ();
    }

}
