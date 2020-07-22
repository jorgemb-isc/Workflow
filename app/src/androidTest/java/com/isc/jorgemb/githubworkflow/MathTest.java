package com.isc.jorgemb.githubworkflow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {

    @Test
    public void test1() {
        double a = 1.1;
        double b = 2.2;
        double expected = 3.3;

        assertEquals(expected, Math.suma(a, b), 0.0);
    }
}
