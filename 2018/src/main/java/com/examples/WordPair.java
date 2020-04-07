package com.examples;

/** This is a possible implementation of WordPair
 *  but is not guaranteed to be the one from the test.
 */

public class WordPair {

    String firstWord;
    String secondWord;

    /** Constructs a WordPair object */
    public WordPair(String first, String second) {
        firstWord = first;
        secondWord = second;
    }

    /** Returns the first string of this WordPair object */
    public String getFirst() {
        return firstWord;
    }

    /** Returns the second string of this WordPair object */
    public String getSecond() {
        return secondWord;
    }

}
