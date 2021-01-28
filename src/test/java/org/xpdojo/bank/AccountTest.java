package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account testAccount = new Account();
        if (testAccount.add(20))
            assertThat(testAccount.getBalance() == 20);
    }

    @Test
    public void withdrawAGoodAmountOfCash(){
        Account testAccount = new Account();
        testAccount.add(100);
        testAccount.remove(20);

        if (testAccount.remove(20))  {
            assertThat(testAccount.getBalance() == 80);
        }
    }
}
