package codingNinjas.DSA.Lecture3_Recursion1;

import java.util.Scanner;

public class AllIndicesOfNumber {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = s.nextInt();
        int output[] = allIndexes(input, x);
        for(int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static int[] allIndexes(int input[], int x) {
        return findAllIndices(input, x, 0);
    }

    private static int[] findAllIndices(int[] input, int x, int startIndex) {
        if(startIndex >= input.length-1){
            if(input[startIndex] == x){
                int[] array = new int[1];
                array[0] = startIndex;
                return array;
            }
            return new int[0];
        }
        int[] smallAnsIndexArray = findAllIndices(input, x, startIndex+1);
        int[] finalAllIndexArray=null;
        if(smallAnsIndexArray.length!=0){
            if(input[startIndex]!=x){
                return smallAnsIndexArray;
            }
            finalAllIndexArray = new int[smallAnsIndexArray.length+1];
            for (int i = 1; i < finalAllIndexArray.length; i++) {
                finalAllIndexArray[i] = smallAnsIndexArray[i-1];
            }
            finalAllIndexArray[0] = startIndex;
            return finalAllIndexArray;
        }else if (input[startIndex]==x){
            finalAllIndexArray = new int[1];
            finalAllIndexArray[0] = startIndex;
            return finalAllIndexArray;
        }
        finalAllIndexArray = new int[0];
        return finalAllIndexArray;
    }
}
