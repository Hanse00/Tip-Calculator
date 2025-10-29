package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
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

    @Test
    void roundsToWholeCents() {
        App classUnderTest = new App();
        Double result = classUnderTest.totalWithTip(1443.76, 8);
        assertEquals(1559.26, result);
    }
}
