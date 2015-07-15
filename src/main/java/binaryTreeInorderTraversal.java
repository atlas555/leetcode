package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author xiaolong zhang
 */
public class binaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (null != root || !stack.empty()){
            if (null != root){
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                inorder.add(root.val);
                root = root.right;
            }
        }
        return inorder;
    }
}
