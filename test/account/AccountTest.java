package account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositNegativeBalance_BalanceRemainUnchangedTest() {
        Account account = new Account();
        account.deposit(-5000);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void depositPositiveBalance_BalanceChangesTest() {
        Account account = new Account();
        account.deposit(2000);
        assertEquals(2000, account.getBalance());
    }

    @Test
    public void depositPositiveBalance_BalanceIncreaseTest() {
        Account account = new Account();
        account.deposit(4000);
        account.deposit(2000);
        assertEquals(6000, account.getBalance());
    }

    @Test
    public void withdrawBalance_BalanceRemainsUnchangedTest() {
        Account account = new Account();
        account.withdraw(5000);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void depositAndWithdrawalHappen_BalanceChangedTest() {
        Account account = new Account();
        account.deposit(3000);
        account.withdraw(2000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void depositAndWithdrawalCanHappen_BalanceChangesTest() {
        Account account = new Account();
        account.deposit(3000);
        account.withdraw(1000);
        account.withdraw(700);
        assertEquals(1300, account.getBalance());
    }

    @Test
    public void withdrawMoreThanDeposit_BalanceUnchangedTest() {
        Account account = new Account();
        account.deposit(3000);
        account.withdraw(-50000);
        assertEquals(3000, account.getBalance());
    }

}
