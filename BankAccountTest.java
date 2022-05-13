import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    BankAccount testBankAccount_1 = new BankAccount(100);
    BankAccount testBankAccount_2 = new BankAccount();

    @Test
    public void depositMore(){
        boolean result = testBankAccount_1.deposit(5001);
        assertFalse(result);
    }

    @Test
    public void depositNegative(){
        boolean result = testBankAccount_1.deposit(-5);
        assertFalse(result);
    }

    @Test
    public void deposit(){
        boolean result = testBankAccount_1.deposit(4999);
        assertTrue(result);
    }

    @Test
    public void withdrawMore(){
        boolean result = testBankAccount_1.withdraw(101);
        assertFalse(result);
    }

    @Test
    public void withdrawNegative(){
        boolean result = testBankAccount_1.withdraw(-99);
        assertFalse(result);
    }

    @Test
    public void withdraw(){
        boolean result = testBankAccount_1.withdraw(99);
        assertTrue(result);
    }

    @Test
    public void transferFromMore(){
        boolean result = testBankAccount_1.transferFrom(500, testBankAccount_2);
        assertFalse(result);
    }

    @Test
    public void transfer(){
        boolean result = testBankAccount_1.transferFrom(50, testBankAccount_2);
        assertTrue(result);
    }

    @Test
    public void transferFromNegative(){
        boolean result = testBankAccount_1.transferFrom(-50, testBankAccount_2);
        assertFalse(result);
    }
}