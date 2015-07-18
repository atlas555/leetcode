package java;

/**
 * @author xiaolong zhang
 */

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

 According to the definition of LCA on Wikipedia:
 “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both
 v and w as descendants (where we allow a node to be a descendant of itself).”
 */

/**
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2,
 * since a node can be a descendant of itself according to the LCA definition.
 */

/**
 * /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//二叉查找树的特性: left < parentValue < right

public class LowestCommonAncestorofaBinarySearchTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;

        if (node.val > p.val && node.val < q.val) {
            return node;
        } else if (node.val > p.val && node.val > q.val) {
            return lowestCommonAncestor(node.left,p,q);
        } else if (node.val < p.val && node.val < q.val) {
            return lowestCommonAncestor(node.right,p,q);
        }
        return root;
    }
}
