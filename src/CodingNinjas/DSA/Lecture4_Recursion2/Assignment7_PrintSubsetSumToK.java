package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class Assignment7_PrintSubsetSumToK {

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
        printSubsetsSumTok(input, k);
    }

    public static void printSubsetsSumTok(int input[], int k) {
        int[] output = new int[0];
        //printSubsetsSumTok(input, 0,output,k);
        printSubsetsSumTok2(input, 0,output,k);

    }

    /*Here we calculate the sum explicitly for each subset in the base case and then compare with k to deduce
    whether the subset is legit or not*/
    public static void printSubsetsSumTok(int input[],int startIndex, int[] output,int k) {
        if(startIndex == input.length){
            int sum=0;
            for(int i = 0; i < output.length; i++) {
                sum+=output[i];
            }
            if(sum==k){
                for(int i = 0; i < output.length; i++) {
                    System.out.print(output[i] + " ");
                }
                System.out.println();
            }
            return;
        }

        printSubsetsSumTok(input, startIndex+1, output,k);
        int[] newOutput = new int[output.length+1];
        System.arraycopy(output,0, newOutput, 0, output.length);
        newOutput[newOutput.length-1] = input[startIndex];
        printSubsetsSumTok(input, startIndex+1, newOutput,k);

    }

    /*Here we calculate the sum explicitly for each subset in the base case and then compare with k to deduce
    whether the subset is legit or not*/
    public static void printSubsetsSumTok2(int input[],int startIndex, int[] output,int k) {
        if(startIndex == input.length){
            if(k==0){
                for(int i = 0; i < output.length; i++) {
                    System.out.print(output[i] + " ");
                }
                System.out.println();
            }
            return;
        }

        printSubsetsSumTok2(input, startIndex+1, output,k);
        int[] newOutput = new int[output.length+1];
        System.arraycopy(output,0, newOutput, 0, output.length);
        newOutput[newOutput.length-1] = input[startIndex];
        printSubsetsSumTok2(input, startIndex+1, newOutput,k-input[startIndex]);

    }

}
