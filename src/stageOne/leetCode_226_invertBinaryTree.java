package stageOne;

import java.util.LinkedList;
import java.util.Queue;

public class leetCode_226_invertBinaryTree {

    //iterate
    public TreeNode_0 invertTree_0(TreeNode_0 root) {
        if(root == null) return null;
        Queue<TreeNode_0> queue = new LinkedList<TreeNode_0>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode_0 current = queue.poll();
            TreeNode_0 temp = current.left;
            current.left = current.right;
            current.right =temp;
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        return root;
    }
   //recursive
    public TreeNode_0 invertTree(TreeNode_0 root) {
        if(root==null) return null;
        TreeNode_0 left = invertTree(root.left);
        TreeNode_0 right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
        }
}
class TreeNode_0 {
    int val;
    TreeNode_0 left;
    TreeNode_0 right;
    TreeNode_0(int x) { val = x; }
 }