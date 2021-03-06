package org.example;


public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    /**
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital, like "Google".
     *
     * @return Given a string word, return true if the usage of capitals in it is right.
     */
    @Override
    public boolean detectCapitalUse() {
        if (myString == null) return false;
        int capLetters = 0;
        int littleLetters = 0;

        if (Character.isUpperCase(myString.charAt(0))) {
            capLetters = 1;
            for (int i = myString.length() - 1; i > 0; i--) {
                if (Character.isUpperCase(myString.charAt(i))) {
                    capLetters++;

                }
            }
        }
        if (capLetters == 1 || Character.isLowerCase(myString.charAt(0))) {
            littleLetters = 1;
            for (int i = myString.length() - 1; i > 0; i--) {
                if (Character.isLowerCase(myString.charAt(i))) {
                    littleLetters++;
                }
            }
        }
        if (capLetters == 1 && littleLetters == myString.length() - 1
                || capLetters == myString.length()
                || littleLetters == myString.length())
            return true;
        else
            return false;

    }
}