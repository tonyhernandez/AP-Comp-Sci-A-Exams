package com.examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class WordPairListTest {

    @Test
    public void testExample1() {
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        printPairs(exampleOne.getAllPairs());
    }

    @Test
    public void testExample2() {
        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        printPairs(exampleTwo.getAllPairs());
    }

    @Test
    public void testExample3() {
        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        Assert.assertEquals(2, exampleThree.numMatches());
    }

    void printPairs(ArrayList<WordPair> pairs) {

        for(WordPair pair : pairs) {
            System.out.print("(\""+pair.getFirst()+"\", \""+pair.getSecond()+"\"), ");
        }
        System.out.print("\n");
    }

}
