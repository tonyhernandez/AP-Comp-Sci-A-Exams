package com.examples;

import java.util.ArrayList;

/**
 * You will implement the constructor and another method for the following WordPairList class.
 */
public class WordPairList {

    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    /** Constructs a WordPairList object as described in part (a).
     *  Precondition: words.length >= 2
     */
    public WordPairList(String[] words) {

        allPairs = new ArrayList<WordPair>();
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i+1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    /** Returns the number of matches as described in part (b).
     */
    public int numMatches() {

        int matches = 0;
        for(WordPair pair : allPairs) {
            if(pair.getFirst().equals(pair.getSecond())){
                matches++;
            }
        }
        return matches;
    }

    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }
}
