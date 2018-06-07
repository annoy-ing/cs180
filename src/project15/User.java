package project15;

import static project15.Item.roundingToTwoDecimals;

public class User {

    private String name;
    private double accountBalance;

    public User(String name) {
        this.name = name;
        accountBalance = 0.00;
    }

    public String getName() {
        return name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double updateBalance(double a) {
        accountBalance += a;
        accountBalance = roundingToTwoDecimals(accountBalance);
        return accountBalance;
    }

    public String toString() {
        return name + "'s balance is $" + accountBalance;
    }

}
