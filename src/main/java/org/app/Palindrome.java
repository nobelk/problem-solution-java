package org.app;

public class Palindrome {
    public static boolean isPalindrome(String s){

        int left = 0;
        int right = s.length() - 1;

        while(left<right){
            Character leftChar = s.charAt(left);
            Character rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(rightChar)){
                right--;
                continue;
            }

            if(Character.toLowerCase(leftChar)
                    !=
                    Character.toLowerCase(rightChar))
            {
                return false;
            }
            else{
                left++;
                right--;
            }
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(Palindrome.isPalindrome("A man, a plan, a canal: Panama"));

    }
}
