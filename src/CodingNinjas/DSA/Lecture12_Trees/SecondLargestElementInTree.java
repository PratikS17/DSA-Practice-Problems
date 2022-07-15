package CodingNinjas.DSA.Lecture12_Trees;

import java.util.Scanner;

public class SecondLargestElementInTree {
    static Scanner s = new Scanner(System.in);

    public static TreeNode<Integer> takeInputLevelWise(){
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
        int rootData = s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
                int numChild = s.nextInt();
                for(int i = 0 ; i < numChild; i++){
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
        TreeNode<Integer> ans = findSecondLargest(root);
        if(ans == null){
            System.out.println(Integer.MIN_VALUE);
        }else{
            System.out.println(ans.data);
        }
    }

    static TreeNode<Integer> largest = new TreeNode<>(Integer.MIN_VALUE);
    static TreeNode<Integer> secondLargest = new TreeNode<>(Integer.MIN_VALUE);

    public static  void findSecondLargestHelper(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        if (root.data > largest.data) {
            secondLargest = largest;
            largest = root;
        } else if (root.data > secondLargest.data && root.data != largest.data) {
            secondLargest = root;
        }

        for (int i = 0; i < root.children.size(); i++) {
            findSecondLargestHelper(root.children.get(i));
        }
    }
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root)
    {
        findSecondLargestHelper(root);
        return secondLargest;
    }

}
