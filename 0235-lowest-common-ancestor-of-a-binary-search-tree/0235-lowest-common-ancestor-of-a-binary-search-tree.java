/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lowest(root,p,q);
        return ans;
    }

    private void lowest(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return;

        if(root.val>=p.val && root.val<=q.val) {
            ans = root;
            return;
        }
        if(root.val<=p.val && root.val>=q.val) {
            ans = root;
            return;
        }
        if(root.val>p.val && root.val>q.val) lowest(root.left,p,q);
        if(root.val<p.val && root.val<q.val) lowest(root.right,p,q);
    }
}