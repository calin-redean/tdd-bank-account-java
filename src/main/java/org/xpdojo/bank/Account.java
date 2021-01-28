package org.xpdojo.bank;

public class Account {

    private int balance = 0;
    public boolean add(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        }
        return false;
    }
    public int getBalance() {
        return balance;
    }
    public boolean remove(int amount) {
        if (amount > 0)
            if (balance - amount > 0) {
                balance = balance - amount;
                return true;
            }
        return false;
    }
}
