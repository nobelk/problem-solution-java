package org.app;

public class InvertBinaryTree {

    public static void invert(TreeNode root){

        if (root==null){
            return;
        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invert(root.left);
        invert(root.right);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(19);
        root.right.right.right = new TreeNode(20);

        InvertBinaryTree.invert(root);
        System.out.println(root.right.val == 4);
        System.out.println(root.left.val == 15);
        System.out.println(root.left.right.val == 14);
        System.out.println(root.left.left.val == 19);
        System.out.println(root.left.left.left.val == 20);
    }
}
