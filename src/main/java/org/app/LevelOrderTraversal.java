package org.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static List<List<Integer>> traverse(TreeNode root){
     List<List<Integer>> result = new ArrayList<>();

     if(root == null){
         return result;
     }

     Queue<TreeNode> queue = new LinkedList<>();
     queue.offer(root);
     while(!queue.isEmpty()){

         int levelSize = queue.size();
         List<Integer> current_level = new ArrayList<>();
         for (int i = 0; i<levelSize; i++){
             TreeNode current_node = queue.poll();
             current_level.add(current_node.val);

             if(current_node.left != null){
                 queue.offer(current_node.left);
             }
             if(current_node.right != null){
                 queue.offer(current_node.right);
             }
         }
         result.add(current_level);
     }

     return result;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<List<Integer>> result = LevelOrderTraversal.traverse(root);
        System.out.println("Level order traversal: " + result);
    }
}
