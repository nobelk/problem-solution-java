package org.app;

import java.util.*;

public class CombinationSum {

    public static List<List<Integer>> find(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<Integer>(), res);
        return res;
    }

    public static void backtrack(int[] candidates, int start, int target, List<Integer> combination, List<List<Integer>> result){

        // stop when target is 0, combination has been found
        if(target == 0){
            result.add(new ArrayList<Integer>(combination));
            return;
        }

        for(int i = start; i<candidates.length; i++){
            if(candidates[i] > target){
                continue; // no combination could be found
            }

            // recursive loop
            combination.add(candidates[i]);
            CombinationSum.backtrack(candidates, i, target - candidates[i], combination, result);
            combination.remove(combination.size() - 1);
        }

        return;
    }


    public static void main(String[] args) {

        // Test case 1
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        System.out.println(CombinationSum.find(candidates, target)); // expected output: [[2, 2, 3], [7]]

        // Test case 2
        candidates = new int[] { 2, 3, 5 };
        target = 8;
        System.out.println(CombinationSum.find(candidates, target)); // expected output: []

        // Test case 3
        candidates = new int[] {};
        target = 8;
        System.out.println(CombinationSum.find(candidates, target)); // expected output: []

        // Test case 4
        candidates = new int[] { 5, 10, 15 };
        target = 20;
        System.out.println(CombinationSum.find(candidates, target)); // expected output: [[5,5,5,5], [5,5,10], [5,15], [10,10]]

        // Test case 5
        candidates = new int[] { 2, 4, 6, 8 };
        target = 10;
        System.out.println(CombinationSum.find(candidates, target)); // expected output: [[2,2,2,2,2], [2,2,2,4], [2,2,6],
        // [2,4,4], [2,8], [4,6]]

        // Test case 6
        candidates = new int[] { 2, 3, 5 };
        target = 0;
        System.out.println(CombinationSum.find(candidates, target)); // expected output: [[]]
    }
}
