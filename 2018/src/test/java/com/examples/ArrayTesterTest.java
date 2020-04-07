package com.examples;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTesterTest {

    @Test
    public void testGetColumn() {

        int[][] arr2D = { { 0, 1, 2 },
                { 3, 4, 5 },
                { 6, 7, 8 },
                { 9, 5, 3 } };

        int[] result = ArrayTester.getColumn(arr2D, 1);

        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(4, result[1]);
        Assert.assertEquals(7, result[2]);
        Assert.assertEquals(5, result[3]);
    }

    @Test
    public void testLatinSquares() {

        int[][] square = { { 1, 2, 3 },
                { 2, 3, 1 },
                { 3, 1, 2 } };

        Assert.assertTrue(ArrayTester.isLatin(square));
    }

}
