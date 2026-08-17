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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        return build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,mp);
    }
    public TreeNode build(int[] postorder,int poststart,int postend,int[] inorder,int instart,int inend,Map<Integer,Integer>mp){
        if(poststart>postend || instart>inend ) return null;
        TreeNode root=new TreeNode(postorder[postend]);
        int inroot=mp.get(root.val);
        int inleft=inroot-instart;
        root.left=build(postorder,poststart,poststart+inleft-1,inorder,instart,inroot+1,mp);
        root.right=build(postorder,poststart+inleft,postend-1,inorder,inroot+1,inend,mp);
        return root;
    }
}