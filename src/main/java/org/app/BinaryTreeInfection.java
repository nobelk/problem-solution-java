package org.app;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BinaryTreeInfection {
    public int amountOfTime(TreeNode root, int start){
        Map<Integer, Set<Integer>> map = new HashMap<>();

        // convert to graph
        ConvertTreeToGraph.convert(root, 0, map);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        int minute = 0;

        Set<Integer> visited = new HashSet<>();

        visited.add(start);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            while(levelSize > 0){
                int current = queue.poll();
                for (int num: map.get(current)){
                    if(!visited.contains(num)){
                        visited.add(num);
                        queue.add(num);
                    }
                }
            levelSize--;
            }
            minute++;
        }

        return minute-1;
    }
}
