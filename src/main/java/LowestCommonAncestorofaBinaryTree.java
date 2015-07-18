package java;

/**
 * @author xiaolong zhang
 */

/**
 Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

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

/**
 * 要求两节点的最近共同父节点（LCA，lowest common ancestor），可以采用树的后序遍历。
 * 如果这两个节点不在一条线上，则它们必定分别在所求节点A的左子树和右子树上，
 * 后序遍历到第一个满足这个条件的节点就是所要求的节点A。另外，当这两个节点在一条线上，
 * 所求节点A则是这两个节点中层次最低的节点的父节点。
 */


public class LowestCommonAncestorofaBinaryTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (null == root) {
//            return null;
//        }
//        TreeNode result = null;
//        index(root,p,q,result,null);
//        return result;
//    }
//
//    boolean index(TreeNode root,TreeNode p, TreeNode q, TreeNode result, TreeNode parent){
//        //后续遍历
//        int left = 0;
//        int right = 0;
//        if(null == result && null != root.left) {
//            index(root.left,p,q,result,root);
//        }
//        if(null == result && null != root.right) {
//            index(root.right,p,q,result,root);
//        }
//
//        int mid = 0;
//        if (root.equals(p) || root.equals(q)) {
//            mid = 1;
//        }
//
//        if (null == result && (left + mid + right) == 2) {
//            if (mid == 1) {
//                result = parent;
//            } else {
//                result = root;
//            }
//        }
//
//        return Boolean.valueOf(String.valueOf(left)) |  Boolean.valueOf(String.valueOf(mid)) |  Boolean.valueOf(String.valueOf(right));
//    }


    class Entity{
        public int count;
        public TreeNode node;

        public Entity(int count, TreeNode node){
            this.count = count;
            this.node = node;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lcaHelper(root, p, q).node;
    }

    public Entity lcaHelper(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return new Entity(0, null);

        Entity left = lcaHelper(root.left, p, q);
        if(left.count==2)
            return left;

        Entity right = lcaHelper(root.right,p,q);
        if (right.count==2)
            return right;

        int numTotal = left.count + right.count;
        if(root== p || root == q){
            numTotal++;
        }

        return new Entity(numTotal, root);
    }
}
