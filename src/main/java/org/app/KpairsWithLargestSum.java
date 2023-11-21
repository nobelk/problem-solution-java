package org.app;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KpairsWithLargestSum {

    public static List<int[]> findKLargestPairs(int[] arr1, int[] arr2, int k){
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((p1, p2) -> (p1[0]+p1[1])-(p2[0]+p2[0]));

        for(int i=0; i<arr1.length && i<k; i++){
            for(int j=0; j<arr2.length && j<k; j++){
                if(minHeap.size() < k){
                    minHeap.add(new int[]{arr1[i], arr2[j]});
                }
                else {
                    if(arr1[i]+arr2[j] < minHeap.peek()[0]+minHeap.peek()[1]){
                        break;
                    }
                    else{
                        // remove the top element
                        minHeap.poll();
                        minHeap.add(new int[]{arr1[i], arr2[j]});
                    }
                }
            }
        }
        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {
        int[] l1 = new int[] { 9, 8, 2 };
        int[] l2 = new int[] { 6, 3, 1 };
        List<int[]> result = KpairsWithLargestSum.findKLargestPairs(l1, l2, 3);
        System.out.print("Pairs with largest sum are: ");
        for (int[] pair : result)
            System.out.print("[" + pair[0] + ", " + pair[1] + "] ");
    }
}
