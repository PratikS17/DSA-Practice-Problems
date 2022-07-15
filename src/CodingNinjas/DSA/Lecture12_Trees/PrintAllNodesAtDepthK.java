package CodingNinjas.DSA.Lecture12_Trees;

import java.util.Scanner;

public class PrintAllNodesAtDepthK {
    static Scanner s = new Scanner(System.in);

    public static TreeNode<Integer> takeInputLevelWise(){
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
//		System.out.println("Enter root Data");
        int rootData = s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
//				System.out.println("Enter number of children of "+currentNode.data);
                int numChild = s.nextInt();
                for(int i = 0 ; i < numChild; i++){
//					System.out.println("Enter "+ i + "th child of " + currentNode.data);
                    int currentChild = s.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
                    pendingNodes.enqueue(childNode);
                    currentNode.children.add(childNode);
                }
            } catch (QueueEmptyException e) {
            }
        }
        return root;
    }


    public static void main(String[] args) {
        int depth = s.nextInt();
        TreeNode<Integer> root =  takeInputLevelWise();
        printAllNodesAtDepthK(root, depth);
    }

    public static void printAllNodesAtDepthK(TreeNode<Integer> root, int depth){
        if(root==null| depth < 0){
            return;
        }
        if(depth==0){
            System.out.println(root.data);
        }
        for (int i = 0; i < root.children.size(); i++) {
            printAllNodesAtDepthK(root.children.get(i), depth-1);
        }

    }
}