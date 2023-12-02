package org.app;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i< s.length(); i++){

            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if (isClosing(s.charAt(i), stack.peek())){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
    public static boolean isClosing(Character c1, Character c2){
        if(c1==')')
            return c2=='(';
        else if(c1=='}')
            return c2=='{';
        else if(c1==']')
            return c2=='[';
        else
            return false;
    }

    public static void main(String[] args){
        System.out.println(ValidParenthesis.isValid("()[]{}"));
    }
}
