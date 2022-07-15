package CodingNinjas.DSA.Lecture12_Trees;

import java.util.Scanner;

public class NodeHavingSumOfChildrenAndNodeIsMax {
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
        TreeNode<Integer> root =  takeInputLevelWise();
        TreeNode<Integer> ans = maxSumNode(root);
        if(ans == null){
            System.out.println(Integer.MIN_VALUE);
        }else{
            System.out.println(ans.data);
        }

    }

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        if(root==null){
            return null;
        }
        int maxSum = getSumOfAllChildren(root);
        TreeNode<Integer> maxSumNode = root;

        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> tempNode = maxSumNode(root.children.get(i));
            int temp = getSumOfAllChildren(tempNode);
            if (temp > maxSum){
                maxSumNode = tempNode;
                maxSum = temp;
            }
        }
        return maxSumNode;

    }

    public static int getSumOfAllChildren(TreeNode<Integer> node){
        int nodeSum = node.data;
        for (int i = 0; i < node.children.size(); i++) {
            nodeSum+=node.children.get(i).data;
        }
        return nodeSum;
    }
}
