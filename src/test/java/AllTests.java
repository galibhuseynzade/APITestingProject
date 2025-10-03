import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class AllTests {
    @Test
    public void helloWorldTest() {
        System.out.println("Hello World");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @Test
    public void helloWorldTest2() {
        System.out.println("Hello World2");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }

    @DisplayName("displayName")
    @Test
    public void displayName() {
        System.out.println("Display Name");
    }

    @Disabled
    @Test
    public void disabled() {
        System.out.println("Disabled");
    }

    @RepeatedTest(5)
    public void repeatedTest() {
        System.out.println("Repeated Test");
    }
}