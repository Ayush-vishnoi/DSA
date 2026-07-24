package Trees;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
        this.node = node;
        this.state = state;
    }
}

class Solution {

    public List<List<Integer>> preInPostTraversal(Node root) {

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        if (root == null)
            return new ArrayList<>();

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        while (!st.isEmpty()) {

            Pair it = st.pop();

            if (it.state == 1) {

                pre.add(it.node.data);

                it.state = 2;
                st.push(it);

                if (it.node.left != null)
                    st.push(new Pair(it.node.left, 1));

            } else if (it.state == 2) {

                in.add(it.node.data);

                it.state = 3;
                st.push(it);

                if (it.node.right != null)
                    st.push(new Pair(it.node.right, 1));

            } else {

                post.add(it.node.data);

            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);

        return result;
    }

    public void printList(List<Integer> list) {
        for (int num : list)
            System.out.print(num + " ");
        System.out.println();
    }
}

public class traversal {

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Solution sol = new Solution();

        List<List<Integer>> traversals = sol.preInPostTraversal(root);

        System.out.print("Preorder: ");
        sol.printList(traversals.get(0));

        System.out.print("Inorder: ");
        sol.printList(traversals.get(1));

        System.out.print("Postorder: ");
        sol.printList(traversals.get(2));
    }
}