import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount(1000);
    }

    @AfterEach
    void teardown() {
        System.out.println("Test Completed");
    }

    @Test
    void testDeposit() {

        // Arrange
        double depositAmount = 500;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1500, account.getBalance());
    }
}