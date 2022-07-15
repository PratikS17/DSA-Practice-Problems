package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class Assignment5_PrintSubsetsOfArray {

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

        printSubsets(input);
    }

    public static void printSubsets(int input[]){
        int[] output = new int[0];
        printSubsets(input, 0,output);
    }


    public static void printSubsets(int input[],int startIndex, int[] output) {
        if(startIndex == input.length){
            for(int i = 0; i < output.length; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        printSubsets(input, startIndex+1, output);
        int[] newOutput = new int[output.length+1];
        System.arraycopy(output,0, newOutput, 0, output.length);
        newOutput[newOutput.length-1] = input[startIndex];
        printSubsets(input, startIndex+1, newOutput);

    }
}
