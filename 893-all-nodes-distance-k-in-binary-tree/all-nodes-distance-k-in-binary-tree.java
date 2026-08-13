/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root==null) return new ArrayList<>();
        Map<TreeNode,TreeNode>parent=new HashMap<>();
        buildparent(root,parent);
        return distance(parent,target,k);
    }
    public void buildparent(TreeNode root,Map<TreeNode,TreeNode> parent){
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(cur.left!=null){
                parent.put(cur.left,cur);
                q.offer(cur.left);
            }
            if(cur.right!=null){
                parent.put(cur.right,cur);
                q.offer(cur.right);
            }
        }
    }
    public List<Integer> distance(Map<TreeNode,TreeNode> parent,TreeNode target,int k){

        Set<TreeNode>vis=new HashSet<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(target);
        vis.add(target);
        int c=0;
        while(!q.isEmpty()){
            int size=q.size();
            if((c++) == k) break;
            for(int i=0;i<size;i++){
                TreeNode nod=q.poll();
                if(nod.left!=null && !vis.contains(nod.left)){
                    vis.add(nod.left);
                    q.offer(nod.left);
                } 
                if(nod.right!=null && !vis.contains(nod.right)){
                    vis.add(nod.right);
                    q.offer(nod.right);
                } 
                if (parent.containsKey(nod) && !vis.contains(parent.get(nod))) {
                    vis.add(parent.get(nod));
                    q.offer(parent.get(nod));
                }
            } 
        }
        List<Integer>ans=new ArrayList<>();
        while(!q.isEmpty()) ans.add(q.poll().val);
        return ans;

    }
}