package CodingNinjas.DSA.Lecture12_Trees;

import java.util.Scanner;

public class CheckIfGenericTreeContainElementX {
    static Scanner s = new Scanner(System.in);

    public static TreeNode<Integer> takeInputLevelWise(){
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of nodes that are entered themselves but their children aren't added yet
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
        int x = s.nextInt();
        TreeNode<Integer> root =  takeInputLevelWise();
        System.out.println(checkIfContainsX(root, x));
    }

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
        if (root.data == x){
            return true;
        }
        for (int i = 0; i < root.children.size(); i++) {
            if(checkIfContainsX(root.children.get(i), x)){
                return true;
            }
        }
        return false;
    }
}
