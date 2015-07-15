package main.java;

import java.util.Stack;

/**
 * @author xiaolong
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    }
public class pathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (null != null){
            return  false;
        }
        if(root.left == null && root.right == null){
            return sum == root.val;
        }
        return hasPathSum(root.left,sum - root.val)
                || hasPathSum(root.right,sum - root.val);
    }
}
