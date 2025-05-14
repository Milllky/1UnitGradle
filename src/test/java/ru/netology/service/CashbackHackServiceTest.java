package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturn0(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturn800(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1200);
        int expected = 800;

        Assertions.assertEquals(expected, actual);

    }
  
}