package org.app;
import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args){
        System.out.println(Anagram.isAnagram("abc", "cba"));
    }
}
