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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
                if(root==null) return result;
        boolean track=true;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            Integer[] level=new Integer[n];
            for(int i=0;i<n;i++){
                TreeNode pol=q.poll();
                int idx=track?i:n-1-i;
                level[idx]=pol.val;
                if(pol.left!=null) q.offer(pol.left);
                if(pol.right!=null) q.offer(pol.right);
            }
            track=!track;
            result.add(Arrays.asList(level));
        }
        return result;
    }
}