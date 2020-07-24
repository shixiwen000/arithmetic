package stageOne;

import java.util.ArrayList;
import java.util.List;

public class leetCode_145_postorderTraversal {
    public List<Integer> postorderTraversal_0(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        helper(root,res);
        return res;
    }
    public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) { helper(root.left,res); }
            if (root.right != null) { helper(root.right,res); }
            res.add(root.val);
        }
    }
}
