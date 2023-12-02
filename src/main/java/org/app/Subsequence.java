package org.app;

public class Subsequence {
    public static boolean isSubsequence(String s, String t){
        int s1Ptr = 0;
        int s2Ptr = 0;

        while(s1Ptr < s.length() && s2Ptr < t.length()){
            if(s.charAt(s1Ptr) == t.charAt(s2Ptr)){
                s1Ptr++;
                s2Ptr++;
            }
            else{
                s2Ptr++;
            }

        }

        return s1Ptr == s.length();
    }

    public static void main(String[] args){
        System.out.println(Subsequence.isSubsequence("abc", "ahbgdc"));
    }
}
