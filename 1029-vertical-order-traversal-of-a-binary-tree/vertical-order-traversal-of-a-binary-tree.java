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
 class tuple{
    TreeNode node;
    int row;
    int col;
    public tuple(TreeNode node,int row,int col){
        this.node=node;
        this.row=row;
        this.col=col;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        Queue<tuple> q=new LinkedList<tuple>();
        q.offer(new tuple(root,0,0));
        while(!q.isEmpty()){
            tuple tup=q.poll();
            TreeNode nod=tup.node;
            int x=tup.row;
            int y=tup.col;
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).offer(nod.val);
            if(nod.left!=null) q.offer(new tuple(nod.left,x-1,y+1));
            if(nod.right!=null) q.offer(new tuple(nod.right,x+1,y+1));
        }
        List<List<Integer>> res=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>>sub:map.values()){
            res.add(new ArrayList<>());
            for(PriorityQueue<Integer>subb:sub.values()){
                while(!subb.isEmpty())
                res.get(res.size()-1).add(subb.poll());
            }
        }
        return res;
    }
}