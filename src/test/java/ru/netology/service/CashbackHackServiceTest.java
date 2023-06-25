package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalcCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCashback2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCashback3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCashback4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCashback5() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1;

        int actual = service.remain(amount);
        int expected = 1001;

        Assert.assertEquals(expected, actual);
    }
}
