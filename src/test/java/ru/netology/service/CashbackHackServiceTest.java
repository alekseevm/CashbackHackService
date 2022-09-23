package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void check900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        assertEquals(expected, service.remain(900));
    }

    @Test
    public void checkZero() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        assertEquals(expected, service.remain(0));
    }

    @Test
    public void checkEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(expected, service.remain(1000));
    }

    @Test
    public void checkThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(expected, service.remain(1001));
    }

    @Test
    public void checkIsMinus() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(expected, service.remain(-100));
    }
}