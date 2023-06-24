package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Autowired
    Addition addition;

    @Test
    public void AddTwoNumbers()
    {
        long a=4,b=6;
        long expectedSum = 10;
        long actualSum = addition.addNumbers(4,6);
        assertEquals(expectedSum, actualSum);

    }
}
