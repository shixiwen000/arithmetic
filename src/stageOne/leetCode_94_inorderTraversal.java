package stageOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetCode_94_inorderTraversal {
    //递归
    public List<Integer> inorderTraversal_0(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        helper(root,res);
        return res;
    }
    public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) { helper(root.left,res); }
            res.add(root.val);
            if (root.right != null) { helper(root.right,res); }
        }
    }
//    迭代
    public List<Integer> inorderTraversal_1(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        while(curr!=null||!stack.isEmpty()) {   //妙啊
            while(curr!=null) {
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;
    }
    //莫里斯遍历

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}