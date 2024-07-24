package com.example.charan;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionTest {

    @Test
    public void testAdd()
    {
        assertEquals(5, Addition.add(2, 3));
    }
}
