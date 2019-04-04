package Aufgaben.a01;

import static prog.ConsoleReader.*;

public class Palindrom {

    public static void main(String[] args) {
        String wort = readString();
        palindromTest(wort);
    }

    public static void palindromTest(String wort ) {
        if(isPalindrom(wort)) {
            System.out.println("Der String " + wort + " ist ein Palindrom");
        }
        else {
            System.out.println("Der String " + wort + " ist kein Palindrom");
        }
    }

    public static boolean isPalindrom(String word) {
        int wordLength = word.length();
        String wordLowercase = word.toLowerCase();

        int secondSubstringStartIndex = (wordLength / 2);
        //Check if word length is odd
        if ((wordLength & 1) != 0) {
            secondSubstringStartIndex = secondSubstringStartIndex + 1;
        }

        String wordFirstHalf = wordLowercase.substring(0, (wordLength / 2));
        String wordSecondHalf = wordLowercase.substring(secondSubstringStartIndex, wordLength);

        return wordFirstHalf.equals(new StringBuilder(wordSecondHalf).reverse().toString());
    }
}