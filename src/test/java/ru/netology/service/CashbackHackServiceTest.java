package ru.netology.service;

import static org.junit.Assert.*;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldSendWhenLessThan1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSendWhenMoreThan1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSendWhen1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}