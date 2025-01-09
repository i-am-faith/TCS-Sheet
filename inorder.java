/*
    Following is the TreeNode class structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.data = val;
            this.left = left;
            this.right = right;
        }
    };
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List< Integer > getInOrderTraversal(TreeNode root) {
        List<Integer> arrl = new ArrayList<>();
        Inorder(root,arrl);
        return arrl;
    }
    private static void Inorder(TreeNode root , List<Integer> arrl)
    {
        if(root == null)
        {
            return;
        }
        Inorder(root.left, arrl);
        arrl.add(root.data);
        Inorder(root.right, arrl);
    }
}