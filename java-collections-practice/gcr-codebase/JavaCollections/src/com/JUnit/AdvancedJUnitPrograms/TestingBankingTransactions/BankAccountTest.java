package com.JUnit.AdvancedJUnitPrograms.TestingBankingTransactions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(500.0);
        assertEquals(500.0, account.getBalance());
    }

    @Test
    void testWithdrawSuccessful() {
        BankAccount account = new BankAccount(1000.0);
        boolean result = account.withdraw(400.0);
        assertTrue(result);
        assertEquals(600.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(200.0);
        boolean result = account.withdraw(300.0);
        assertFalse(result);
        assertEquals(200.0, account.getBalance()); // balance remains unchanged
    }

    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount();
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100.0));
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount();
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-50.0));
    }
}
