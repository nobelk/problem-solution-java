package org.app;

import java.util.*;

public class AllSubsets {

    public static List<List<Integer>> findAllSubsets(int[] nums){
        List<List<Integer>> allSubsets = new ArrayList<>();
        allSubsets.add(new ArrayList<Integer>());

        for(int num : nums){
            int currentSubsetSize = allSubsets.size();
            for(int index = 0; index < currentSubsetSize; index++){
                List<Integer> current = new ArrayList(allSubsets.get(index));
                current.add(num);
                allSubsets.add(current);
            }
        }

        return allSubsets;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = AllSubsets.findAllSubsets(new int[] { 1, 3 });
        System.out.println("Here is the list of subsets: " + result);

        result = AllSubsets.findAllSubsets(new int[] { 1, 5, 3 });
        System.out.println("Here is the list of subsets: " + result);
    }
}
