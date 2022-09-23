package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void checkAmount900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        assertEquals(service.remain(900), expected);
    }

    @Test
    public void checkZero() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        assertEquals(service.remain(0), expected);
    }

    @Test
    public void checkEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(service.remain(1000), expected);
    }

    @Test
    public void checkMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(service.remain(1001), expected);
    }

    @Test
    public void checkAmountIsMinus() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(service.remain(-100), expected);
    }

}
