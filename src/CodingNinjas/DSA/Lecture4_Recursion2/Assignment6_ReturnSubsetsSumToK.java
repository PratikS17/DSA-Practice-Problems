package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment6_ReturnSubsetsSumToK {

    static Scanner s = new Scanner(System.in);
    public static int[] takeInput() {
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int k = s.nextInt();
        int output[][] = subsetsSumK(input, k);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] subsetsSumK(int input[], int k) {
        int output[][] = subsets(input,0);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < output.length; i++) {
            int sum =0;
            for (int j = 0; j < output[i].length; j++) {
                sum+=output[i][j];
            }
            if(sum==k){
                list.add(output[i]);
            }
        }

        int[][] finalAns = new int[list.size()][];
        for (int i = 0; i < list.size(); i++){
            finalAns[i] = list.get(i);
        }
        return finalAns;
    }

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
