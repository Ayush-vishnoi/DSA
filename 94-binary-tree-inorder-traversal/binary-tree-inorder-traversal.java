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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode>st=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        TreeNode cur=root;
        while(!st.isEmpty() || cur!=null){
            while(cur!=null){
             st.push(cur);
             cur=cur.left;
            }
            cur=st.pop();
            ans.add(cur.val);
            cur=cur.right;
        }
        return ans;
    }
}