package com.examples;

public class CodeWordChecker implements StringChecker {


    int minimumLenght = 6;
    int maximumLength = 20;
    String excludeString;

    public CodeWordChecker(int min, int max, String excludeStr) {
        this.minimumLenght = min;
        this.maximumLength = max;
        this.excludeString = excludeStr;
    }

    public CodeWordChecker(String excludeString) {
        this.excludeString = excludeString;
    }

    public boolean isValid(String str) {

        if(str.length() < minimumLenght || str.length() > maximumLength || str.contains(excludeString)) {
            return false;
        }
        return true;
    }
}
