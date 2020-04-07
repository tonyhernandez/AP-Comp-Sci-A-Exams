package com.examples;

import org.junit.Assert;
import org.junit.Test;

public class WordPairListTest {

    @Test
    public void testExample1() {
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
    }

    @Test
    public void testExample2() {
        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
    }

    @Test
    public void testExample3() {
        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
    }

}
