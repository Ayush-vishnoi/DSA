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

public class preorder {
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
    public static ArrayList<Integer> preorderRecursive(Node root, ArrayList<Integer> ans) {

        if (root == null)
            return ans;

        ans.add(root.data);

        preorderRecursive(root.left, ans);
        preorderRecursive(root.right, ans);

        return ans;
    }

    // Iterative Preorder using Stack
    public static ArrayList<Integer> preorderIterative(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {

            Node curr = st.pop();

            ans.add(curr.data);

            if (curr.right != null)
                st.push(curr.right);

            if (curr.left != null)
                st.push(curr.left);
        }

        return ans;
    }

    public static void main(String[] args) {

        Node root = buildTree();
    
        ArrayList<Integer> recursiveAns = new ArrayList<>();
        preorderRecursive(root, recursiveAns);
    
        ArrayList<Integer> iterativeAns = preorderIterative(root);
    
        System.out.println("\nRecursive Preorder : " + recursiveAns);
        System.out.println("Iterative Preorder : " + iterativeAns);
    }
}
