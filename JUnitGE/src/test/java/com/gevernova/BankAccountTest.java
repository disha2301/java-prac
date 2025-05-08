package com.gevernova;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    // runs before each test to create a fresh account
    @BeforeEach
    void setUp(){
        account = new BankAccount();
    }
    @Test
    void testDeposit(){
        account.deposit(1000);
        assertEquals(1000,account.getBalance());
    }
    @Test
    void testWith_SufficientBalance(){
        account.deposit(1000);
        boolean success = account.withDraw(500);
        assertTrue(success);
        assertEquals(500,account.getBalance());
    }
    @Test
    void testWith_InsufficientBalance(){
        account.deposit(1000);
        boolean success = account.withDraw(1200);
        assertFalse(success);
        assertEquals(300,account.getBalance());
    }
    @Test
    void testGetBalance(){
        assertEquals(0,account.getBalance());
    }
}
