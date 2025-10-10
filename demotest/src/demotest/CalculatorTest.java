package demotest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CalculatorTest {

    static Calculator calc;

    @BeforeAll
    static void initAll() {
        System.out.println(">>> Before All Tests");
        calc = new Calculator();
    }

    @BeforeEach
    void init() {
        System.out.println("-> Before Each Test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("<- After Each Test");
    }

    @AfterAll
    static void done() {
        System.out.println("<<< After All Tests");
    }

    @Test
    @DisplayName("Test Addition")
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    @DisplayName("Test Subtraction")
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    @DisplayName("Test Multiplication")
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    @DisplayName("Test Division")
    void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    @DisplayName("Test Divide by Zero Exception")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @Disabled("Temporarily disabled")
    @Test
    void testDisabledExample() {
        assertEquals(10, calc.add(5, 5));
    }
}
