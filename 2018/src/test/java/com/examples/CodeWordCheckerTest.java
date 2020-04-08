package com.examples;

import org.junit.Assert;
import org.junit.Test;

public class CodeWordCheckerTest {

    @Test
    public void testIsValidTest1(){
        StringChecker sc1 = new CodeWordChecker(5, 8, "$");
        sc1.isValid("happy"); // The code word is valid.
        sc1.isValid("happy$"); // The code word contains "$".
        sc1.isValid("Code"); //|The code word is too short.
        sc1.isValid("happyCode"); //The code word is too long.
    }

    @Test
    public void testIsValidTest2(){
        StringChecker sc2 = new CodeWordChecker("pass");
        Assert.assertTrue(sc2.isValid("MyPass")); //The code word is valid.
        Assert.assertFalse(sc2.isValid("Mypassport")); //The code word contains "pass".
        Assert.assertFalse(sc2.isValid("happy")); //The code word is too short.
        Assert.assertFalse(sc2.isValid("1,000,000,000,000,000")); //The code word is too long.
    }
}
