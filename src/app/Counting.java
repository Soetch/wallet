package app;

import util.Exceptions;

public class Counting {
    public int money = 0;

    /**
     * @return The balance of the account.
     */
    public int returnMoney() {
        return money;
    }

    /**
     * Adds money to a balance.
     */
    public String addMoney(int amountToAdd, boolean doReturn) {
        // Adds the money.
        money = money + amountToAdd;
        // Checks whether it returns or not.
        if(doReturn) {
            return String.valueOf(money);
        } else {
            return Exceptions.addMoneyNoReturn;
        }
    }

    /**
     * Takes money to a balance.
     */
    public String takeMoney(int amountToTake, boolean doReturn) {
        // Take the money.
        money = money - amountToTake;
        // Checks whether it returns or not.
        if(doReturn) {
            return String.valueOf(money);
        } else {
            return Exceptions.takeMoneyNoReturn;
        }
    }
}
