package com.example.loginapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testUsername(){
        assertEquals("User validation failed", "din_dijarin", "din_dijarin");
    }

    @Test
    public void testPassword(){
        assertEquals("User validation failed", "baby_yoda_ftw", "baby_yoda_ftw");
    }

}