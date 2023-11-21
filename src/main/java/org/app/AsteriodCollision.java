package org.app;

import java.util.Stack;

public class AsteriodCollision {
    public static boolean isCollision(int x, int y){
        return x*y < 0;
    }

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<asteroids.length; i++){
            stack.push(asteroids[i]);

            while(stack.size() >= 2){
                int first = stack.pop();
                int second = stack.peek();

                if(!isCollision(first, second)){
                    stack.push(first);
                    break;
                }

                if(Math.abs(first)>=Math.abs(second)){
                    stack.pop();
                    stack.push(first);
                }
            }
        }


        int[] r = new int[stack.size()];
        int i = stack.size()-1;
        while(i>=0){
            r[i] = stack.pop();
            i--;
        }
        return r;
    }

    public static void main(String[] args){
        int[] i = new int[] { 5, 10, -5 };
        int[] r = AsteriodCollision.asteroidCollision(i);
        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}
