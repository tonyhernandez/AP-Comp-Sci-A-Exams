package com.examples;

public class ArrayTester {

    /** Returns an array containing the elements of column c of arr2D in the same order as they
     *  appear in arr2D.
     *  Precondition: c is a valid column index in arr2D.
     *  Postcondition: arr2D is unchanged.
     */
    public static int[] getColumn(int[][] arr2D, int c) {

        int[] column = new int[arr2D.length];
        for(int row = 0; row < arr2D.length; row++) {
            column[row] = arr2D[row][c];
        }
        return column;
    }

    /** Returns true if and only if every value in arr1 appears in arr2.
     *  Precondition: arr1 and arr2 have the same length.
     *  Postcondition: arr1 and arr2 are unchanged.
     */
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        /* sample implementation */
        for(int i = 0; i < arr1.length; i++) {
            boolean foundValue = false;
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    foundValue = true;
                }
            }
            if(!foundValue) {
                return false;
            }
        }
        return true;
    }

    /** Returns true if arr contains any duplicate values;
     *          false otherwise.
     */
    public static boolean containsDuplicates(int[] arr) {
        /* sample implementation */
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /** Returns true if square is a Latin square as described in part (b);
     *          false otherwise.
     *  Precondition: square has an equal number of rows and columns.
     *                 square has at least one row.
     */
    public static boolean isLatin(int[][] square) {

        // Checks the first row has no duplicate values
        if(containsDuplicates(square[0])) {
            return false;
        }

        // Checks all values in the first row of the square appear in each row of the square
        for(int i = 1; i < square.length; i++) {

            if(!hasAllValues(square[0],square[i])){
                return false;
            }
        }

        // Checks all values in the first row of the sqaure appear in each column of the square
        for(int i = 0; i < square.length; i++) {

            int[] column = getColumn(square, i);
            if(!hasAllValues(square[0],column)){
                return false;
            }
        }

        return true;
    }
}
