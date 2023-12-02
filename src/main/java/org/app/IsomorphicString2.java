package org.app;
import java.util.HashMap;

public class IsomorphicString2 {
    public static boolean wordPattern(String pattern, String s){
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length)
            return false;

        HashMap<Character, String> cToS = new HashMap<>();
        HashMap<String,Character> sToC = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            String currStr = arr[i];
            char curr = pattern.charAt(i);

            if(!cToS.containsKey(curr)){
                if(!sToC.containsKey(currStr)){
                    cToS.put(curr, currStr);
                    sToC.put(currStr, curr);
                }
                else if(!sToC.get(currStr).equals(curr)){
                    return false;
                }
            }
            else if(!cToS.get(curr).equals(currStr)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(IsomorphicString2.wordPattern("abba", "dog cat cat fish"));
    }
}
