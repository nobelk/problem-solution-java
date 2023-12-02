package org.app;
import java.util.List;
import java.util.ArrayList;

public class MinDifferenceBetweenNodes {

    private List<Integer> nodeList = new ArrayList<>();

    public void inorderTraverse(TreeNode root){
        if(root  == null){
            return;
        }

        inorderTraverse(root.left);
        nodeList.add(root.val);
        inorderTraverse(root.right);
    }

    public int getMinDifference(TreeNode root){
        inorderTraverse(root);
        int minDifference = Integer.MAX_VALUE;

        for(int i=1; i<nodeList.size(); i++){
            minDifference = Math.min(minDifference, Math.abs(nodeList.get(i) - nodeList.get(i-1)));
        }

        return minDifference;
    }
}
