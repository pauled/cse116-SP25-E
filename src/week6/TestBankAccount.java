package week6;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestBankAccount {
    @Test
    public void testAccount(){
        BankAccount account1=new BankAccount("Ada",100.0);
        assertEquals("Account owner constructor","Ada",account1.getAccountHolder());
        assertEquals("Account balance constructor",100.0,account1.checkBalance(),.001);

        account1.deposit(5.5);
        assertEquals("Account balance deposit",105.5,account1.checkBalance(),.001);

        account1.deposit(1.0);
        assertEquals("Account balance deposit",106.5,account1.checkBalance(),.001);

        account1.withdrawl(10.0);
        assertEquals("Account balance withdrawl",96.5,account1.checkBalance(),.001);

        account1.withdrawl(1.5);
        assertEquals("Account balance withdrawl",95.0,account1.checkBalance(),.001);

        BankAccount account2=new BankAccount("Bob",19.95);
        assertEquals("Account owner constructor","Bob",account2.getAccountHolder());
        assertEquals("Account balance constructor",19.95,account2.checkBalance(),.001);

        account1.transfer(account2,50);
        assertEquals("tranafer account 2",69.95,account2.checkBalance(),.001);
        assertEquals("transfer account 1",45.0,account1.checkBalance(),.001);

        assertFalse("overdrawn fail",account1.isOverdrawn());
        assertFalse("overdrawn fail", account2.isOverdrawn());

        account1.withdrawl(50);
        assertEquals("Account balance withdrawl",-5.0,account1.checkBalance(),.001);
        assertTrue("overdrawn fail",account1.isOverdrawn());
    }
}
