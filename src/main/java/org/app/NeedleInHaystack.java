package org.app;

public class NeedleInHaystack {

    public static int findNeedleInHaystack(String haystack, String needle){

        int m = needle.length();
        int n = haystack.length();

        for(int windowStart =0; windowStart <= n-m; windowStart++){
            for(int i=0; i<m; i++){
                if(needle.charAt(i) != haystack.charAt(windowStart + i)){
                    break;
                }
                if(i==m-1){
                    return windowStart;
                }
            }
        }


        return -1;
    }

    public static void main(String[] args){
        System.out.println(NeedleInHaystack.findNeedleInHaystack("hello", "ll"));
        System.out.println(NeedleInHaystack.findNeedleInHaystack("sadbutsad", "skkkkkkkad"));

        System.out.println(NeedleInHaystack.findNeedleInHaystack("leetcode", "leetcod"));

    }
}
