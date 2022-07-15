package CodingNinjas.DSA.Lecture12_Trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreOrderAndPostOrderTraversal {
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
    static StringTokenizer st;

    public static TreeNode<Integer> takeInputLevelWise() throws IOException {
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>(); // Queue of node that are
        // entered themselves
        // but their children
        // aren't added yet
        st = new StringTokenizer(br.readLine());
        int rootData = Integer.parseInt(st.nextToken());
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
                int numChild = Integer.parseInt(st.nextToken());
                for (int i = 0; i < numChild; i++) {
                    int currentChild = Integer.parseInt(st.nextToken());
                    TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
                    pendingNodes.enqueue(childNode);
                    currentNode.children.add(childNode);
                }
            } catch (QueueEmptyException e) {
            }
        }
        return root;
    }

    public static void main(String[] args) throws IOException {
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println("Pre Order Traversal : ");
        printPreOrder(root);
        System.out.println();
        System.out.println("Post Order Traversal : ");
        printPostOrder(root);
    }

    public static void printPostOrder(TreeNode<Integer> root){
        for (int i = 0; i < root.children.size(); i++) {
            printPostOrder(root.children.get(i));
        }
        System.out.print(root.data+" ");
    }

    public static void printPreOrder(TreeNode<Integer> root){
        System.out.print(root.data+" ");
        for (int i = 0; i < root.children.size(); i++) {
            printPreOrder(root.children.get(i));
        }
    }

}
