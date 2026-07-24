package Trees;
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class inorder {
    static Scanner sc = new Scanner(System.in);

    public static Node buildTree() {

        System.out.print("Enter root (-1 for null): ");
        int val = sc.nextInt();

        if (val == -1)
            return null;

        Node root = new Node(val);

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            Node curr = q.poll();

            System.out.print("Enter left child of " + curr.data + " (-1 for null): ");
            int left = sc.nextInt();

            if (left != -1) {
                curr.left = new Node(left);
                q.offer(curr.left);
            }

            System.out.print("Enter right child of " + curr.data + " (-1 for null): ");
            int right = sc.nextInt();

            if (right != -1) {
                curr.right = new Node(right);
                q.offer(curr.right);
            }
        }

        return root;
    }

    // Recursive Preorder
    public static ArrayList<Integer> inorderRecursive(Node root, ArrayList<Integer> ans) {

        if (root == null)
            return ans;

        inorderRecursive(root.left, ans);
        ans.add(root.data);
        inorderRecursive(root.right, ans);

        return ans;
    }

    // Iterative Preorder using Stack
    public static ArrayList<Integer> inorderIterative(Node root) {

        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node>st=new Stack<>();
        Node cur=root;
        while(cur!=null || !st.isEmpty()){
            while(cur!=null){
                st.push(cur);
                cur=cur.left;
            }
            cur=st.pop();
            ans.add(cur.data);
            cur=cur.right;
        }
        return ans;
    }

    public static void main(String[] args) {

        Node root = buildTree();
    
        ArrayList<Integer> recursiveAns = new ArrayList<>();
        inorderRecursive(root, recursiveAns);
    
        ArrayList<Integer> iterativeAns = inorderIterative(root);
    
        System.out.println("\nRecursive Inorder : " + recursiveAns);
        System.out.println("Iterative Inorder : " + iterativeAns);
    }
}
