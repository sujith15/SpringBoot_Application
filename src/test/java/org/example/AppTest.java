package org.example;

import org.junit.Test;
import org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Autowired
    Calci calci;

    @Test
    public void AddTwoNumbers()
    {
        long expectedSum = 10;
        long actualSum = calci.add(4,6);
        assertEquals(expectedSum, actualSum);

    }

    @Test
    public void AddTwoNumbersFail()
    {
        long expectedSum = 11;
        long actualSum = calci.add(4,6);
        assertNotEquals(expectedSum, actualSum);

    }


}
