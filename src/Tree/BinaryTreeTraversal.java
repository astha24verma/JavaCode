package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Binary Tree - Implementation

//Binary Tree Traversals:
//Tree Traversal algorithms can be classified broadly into two categories:

//1. Breadth First Traversal (Or Level Order Traversal) - or BFS
//2. Depth First Traversals
// --> Inorder Traversal (Left-Root-Right)          L N R
// --> Preorder Traversal (Root-Left-Right)         N LR
// --> Postorder Traversal (Left-Right-Root)        LR N


public class BinaryTreeTraversal {

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = null;
        root = createBinaryTree(root);

        // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
        levelOrderTraversal(root);
        System.out.println();
        System.out.println();

        inorderTraversal(root);
        System.out.println();
        System.out.println();
        preorderTraversal(root);
        System.out.println();
        System.out.println();
        postorderTraversal(root);
        System.out.println();
        System.out.println();

    }

    //Inorder Traversal (Left-Root-Right)
    public static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }


    //Preorder Traversal (Root-Left-Right)
    private static void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    //Postorder Traversal (Left-Right-Root)
    private static void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    //Level Order Traversal - BFS
    public static void levelOrderTraversal(Node root) {
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);

        while (!que.isEmpty()) {
            Node temp = que.poll();
            if (temp == null) {
                if (que.isEmpty()) {  // No element in Queue now
                    return;
                }
                que.add(null);
                System.out.println(); // Give a New Line <-
            } else {
                System.out.print(temp.val + " ");

                if (temp.left != null) {
                    que.add(temp.left);
                }

                if (temp.right != null) {
                    que.add(temp.right);
                }
            }

        }


    }

    static Node createBinaryTree(Node root) {
        System.out.println("Enter data : ");
//         Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);

        // Recursion will create tree for left node
        System.out.println("Enter data left of " + root.val + " - ");
        root.left = createBinaryTree(root.left);

        // Recursion will create tree for right node
        System.out.println("Enter data right of " + root.val + " - ");
        root.right = createBinaryTree(root.right);

        return root;

    }

}


class Node {
    int val;
    Node left;
    Node right;

    // Constructor
    public Node(int item) {
        val = item;
        left = null;
        right = null;
    }


}