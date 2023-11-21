package org.app;
import java.util.Stack;
import java.util.Arrays;

public class RemoveDuplicates {
    public static String removeDuplicates(String s, int k){
        StringBuilder res = new StringBuilder();
        Stack<int[]> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()[0] == c){
                stack.peek()[1]++;
            }
            else {
                stack.push(new int[]{c, 1});
            }

            if(stack.peek()[1] == k) {
                stack.pop();
            }
        }

        while(!stack.isEmpty()){
            int[] top = stack.pop();
            res.append(String.valueOf((char)top[0]).repeat(top[1]));
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();
        System.out.println(solution.removeDuplicates("abbbaaca", 3)); // Output: "ca"
        System.out.println(solution.removeDuplicates("abbaccaa", 3)); // Output: "abbaccaa"
        System.out.println(solution.removeDuplicates("abbacccaa", 3)); // Output: "abb"
    }
}
