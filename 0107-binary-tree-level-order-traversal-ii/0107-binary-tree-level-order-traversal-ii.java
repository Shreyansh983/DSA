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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<List<Integer>> stack = new ArrayDeque<>();
        if(root==null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode current = queue.poll();
                levelList.add(current.val);
                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
            stack.push(levelList);
        }
        while(!stack.isEmpty()){
            List<Integer> li = stack.poll();
            list.add(li);
        }
        return list;
    }
}