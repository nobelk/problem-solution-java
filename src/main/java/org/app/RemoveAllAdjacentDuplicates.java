package org.app;
import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    public static String removeDuplicates(String s){
        StringBuilder stack = new StringBuilder();

        for(Character c : s.toCharArray()){
            int length = stack.length();

            if(length > 0 && c == stack.charAt(length-1)){
                stack.deleteCharAt(length-1);
            }
            else{
                stack.append(c);
            }
        }

        return stack.toString();
    }

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicates solution = new RemoveAllAdjacentDuplicates();
        System.out.println(solution.removeDuplicates("abccba")); // Output: ""
        System.out.println(solution.removeDuplicates("foobar")); // Output: "fbar"
        System.out.println(solution.removeDuplicates("abcd")); // Output: "abcd"
    }
}
