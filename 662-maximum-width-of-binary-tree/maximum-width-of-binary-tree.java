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
 class pair{
    TreeNode node;
    int seq;
    pair(TreeNode node,int seq){
        this.node=node;
        this.seq=seq;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<pair>q=new LinkedList<>();
        int maxi=0;
        q.offer(new pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int minidx=q.peek().seq;
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
                pair p=q.poll();
                TreeNode cur=p.node;
                int s=p.seq-minidx;
                if(i==0) first=s;
                if(i==size-1) last=s;
                if(cur.left!=null) q.offer(new pair(cur.left,2*s+1));
                if(cur.right!=null) q.offer(new pair(cur.right,2*s+2));
                maxi=Math.max(maxi,last-first+1);
            }
        }
        return maxi;
    }
}