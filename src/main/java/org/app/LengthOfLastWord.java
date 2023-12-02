package org.app;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s){
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }

    public static void main(String[] args){
        System.out.println(LengthOfLastWord.lengthOfLastWord("Hello World"));
    }
}
