package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */

@SpringBootTest
public class AppTest
{
    /**
     * Rigorous Test :-)
     */

    Calci calci = new Calci();

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
