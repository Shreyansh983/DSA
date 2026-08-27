/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    /**
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        int i =0,j = list.size()-1;
        while(i<j){
            int sum = list.get(i)+list.get(j);
            if(sum>k) j--;
            else if(sum<k) i++;
            if(sum==k) return true;
        }
        return false;
    }

    private void dfs(TreeNode root,List<Integer> list){
        if(root==null) return;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
     */
    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}