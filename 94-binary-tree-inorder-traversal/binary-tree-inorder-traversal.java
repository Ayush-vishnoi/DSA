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
    //     ArrayList<Integer> arr= new ArrayList<>();
    //     pre(root,arr);
    //     return arr;
    // }
    // public void pre(TreeNode root,ArrayList<Integer> arr){
    //     if(root==null) return;
    //     pre(root.left,arr);
    //     arr.add(root.val);
    //     pre(root.right,arr);
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
            st.push(curr);
            curr=curr.left;
            }
            curr=st.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;
    }

}