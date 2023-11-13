package org.app;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q){

        // base cases
        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args){
        TreeNode p = new TreeNode(10);
        p.left = new TreeNode(4);
        p.left.left = new TreeNode(1);
        p.right = new TreeNode(15);
        p.right.left = new TreeNode(14);

        TreeNode q = new TreeNode(10);
        q.left = new TreeNode(4);
        q.left.left = new TreeNode(1);
        q.right = new TreeNode(15);
        q.right.left = new TreeNode(14);

        System.out.println(SameTree.isSameTree(p, q));

        q.right.right = new TreeNode(20);
        System.out.println(SameTree.isSameTree(p, q));

        p.right.right = new TreeNode(20);
        System.out.println(SameTree.isSameTree(p, q));

        p.left.val = 9;
        System.out.println(SameTree.isSameTree(p, q));
    }
}
