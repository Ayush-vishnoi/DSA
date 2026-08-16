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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length,map);
    }
    public TreeNode build(int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend,Map<Integer,Integer>map){
        if(prestart>preend || instart>inend) return null;
        TreeNode root=new TreeNode(preorder[prestart]);
        int inroot=map.get(root.val);
        int inleft=inroot-instart;
        root.left=build(preorder,prestart+1,prestart+inleft,inorder,instart,inroot-1,map);
        root.right=build(preorder,prestart+inleft+1,preend,inorder,inroot+1,inend,map);
        return root;
    }
}