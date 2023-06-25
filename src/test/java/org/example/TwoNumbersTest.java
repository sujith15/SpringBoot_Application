package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoNumbersTest {

    @Test
    void testGetNum1() {
        long expectedNum1 = 5;
        long num2 = 10;

        TwoNumbers twoNumbers = new TwoNumbers();
        twoNumbers.setNum1(expectedNum1);
        twoNumbers.setNum2(num2);

        long actualNum1 = twoNumbers.getNum1();

        assertEquals(expectedNum1, actualNum1);
    }

    @Test
    void testGetNum2() {
        long num1 = 5;
        long expectedNum2 = 10;

        TwoNumbers twoNumbers = new TwoNumbers();
        twoNumbers.setNum1(num1);
        twoNumbers.setNum2(expectedNum2);

        long actualNum2 = twoNumbers.getNum2();

        assertEquals(expectedNum2, actualNum2);
    }
}
