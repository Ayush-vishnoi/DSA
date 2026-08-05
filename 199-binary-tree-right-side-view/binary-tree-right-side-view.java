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
    int pos;
    pair(TreeNode node,int pos){
        this.node=node;
        this.pos=pos;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<pair>q=new LinkedList<>();
        TreeMap<Integer,Integer>map=new TreeMap<>();
        if(root==null) return ans;
        q.offer(new pair(root,0));
        while(!q.isEmpty()){
            pair pol=q.poll();
            TreeNode nod=pol.node;
            int p=pol.pos;
            map.putIfAbsent(p,nod.val);
            if(nod.right!=null) q.offer(new pair(nod.right,p+1));
            if(nod.left!=null) q.offer(new pair(nod.left,p+1));
        }
        ans.addAll(map.values());
        return ans;
        
    }
}