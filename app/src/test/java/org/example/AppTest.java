package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void calculatesBasedOnPercentage() {
        App classUnderTest = new App();
        Double result = classUnderTest.totalWithTip(10.0, 10);
        assertEquals(10.0 + 1.0, result);
    }

    @Test
    void calculatesBasedOnPercentage2() {
        App classUnderTest = new App();
        Double result = classUnderTest.totalWithTip(150.0, 15);
        assertEquals(150.0 + 22.5, result);
    }
}
