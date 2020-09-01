package com.daclink.drew.codereviewinclass;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void util_adderTest(){
        assertEquals(5,  Util.adder(2,3));
        assertEquals(7,  Util.adder(4,3));
    }
}

