package org.app;
import java.util.HashMap;
import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappy(int n){
        HashSet<Integer> seen = new HashSet<>();

        while( n!=1 && !seen.contains(n) ){
            seen.add(n);
            n = getNext(n);
        }

        return n==1;
    }

    public static int getNext(int n){
        int sum = 0;

        while(n>0){
            int r = n%10;
            n = n/10;
            sum += r*r;
        }

        return sum;
    }

    public static void main(String[] args){
        System.out.println(HappyNumber.isHappy(19));
    }
}
