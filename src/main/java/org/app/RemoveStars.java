package org.app;
import java.util.Stack;
import java.util.Arrays;

public class RemoveStars {

    public static String remove(String key){
        Stack<Character> s = new Stack<>();

        for(int index =0; index<key.length(); index++){
            if(key.charAt(index) == '*'){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else{
                s.push(key.charAt(index));
            }
        }

        if(s.isEmpty()){
            return "";
        }
        else{
            String r =  Arrays.toString(s.toArray());
            return r.substring(1, r.length()-1);
        }
    }
    public static void main(String[] args){
        String s = RemoveStars.remove("leet**cod*e");
        System.out.println(s);
        System.out.println(s.compareTo("lecoe"));
    }
}
