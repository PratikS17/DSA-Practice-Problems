package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class Assignment4_ReturnSubsetOfAnArray {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        //int output[][] = subsets(input);
        int output[][] = subsets(input,0);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

    //This method is where we change the input array itself everytime by removing the 1st element
    public static int[][] subsets(int input[]) {
        if(input.length==0){
            int[][] output = new int[1][];
            output[0] = new int[0];
            return output;
        }

        int newInput[] = new int[input.length-1];
        System.arraycopy(input,1, newInput, 0, newInput.length);
        int[][] smallAns = subsets(newInput);
        int[][] finalAns = new int[smallAns.length * 2][];
        int k=0;
        for (int i = 0; i < smallAns.length; i++) {
            finalAns[i] = smallAns[i];
            k++;
        }
        for (int i = 0; i < smallAns.length; i++) {
            int subSet[] = new int[smallAns[i].length+1];
            if(smallAns[i].length!=0){
                System.arraycopy(smallAns[i],0, subSet, 1, smallAns[i].length);
            }
            subSet[0] = input[0];
            finalAns[k] = subSet;
            k++;
        }
        return finalAns;
    }

    /*This method is where we keep the input array intact , we just adjust the startIndex every time by incrementing
    it by 1 thereby giving removing the 1st element
    */

    public static int[][] subsets(int input[], int startIndex) {
        if(startIndex == input.length){
            int[][] output = new int[1][];
            output[0] = new int[0];
            return output;
        }

        int[][] smallAns = subsets(input, startIndex+1);
        int[][] finalAns = new int[smallAns.length * 2][];
        int k=0;
        for (int i = 0; i < smallAns.length; i++) {
            finalAns[i] = smallAns[i];
            k++;
        }
        for (int i = 0; i < smallAns.length; i++) {
            int subSet[] = new int[smallAns[i].length+1];
            if(smallAns[i].length!=0){
                System.arraycopy(smallAns[i],0, subSet, 1, smallAns[i].length);
            }
            subSet[0] = input[startIndex];
            finalAns[k] = subSet;
            k++;
        }
        return finalAns;
    }
}
