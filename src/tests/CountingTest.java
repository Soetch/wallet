package tests;

import app.Counting;
import org.junit.jupiter.api.Test;

class CountingTest {
    Counting counting = new Counting();

    @Test
    void returnMoney() {
        System.out.println(counting.returnMoney());
    }

    @Test
    void addMoneyNoReturn() {
        System.out.println(counting.addMoney(10, true));
    }
    @Test
    void addMoneyReturn() {
        System.out.println(counting.addMoney(10, true));
    }

    @Test
    void takeMoneyNoReturn() {
        System.out.println(counting.takeMoney(10, true));
    }

    @Test
    void takeMoneyReturn() {
        System.out.println(counting.takeMoney(10, true));
    }
}