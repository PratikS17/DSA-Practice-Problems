package codingNinjas.DSA.Lecture3_Recursion1;

import java.util.Scanner;

public class LastIndexOfNumber {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = s.nextInt();
        System.out.println(lastIndex(input, x));
    }

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static int lastIndex(int input[], int x) {
        return findLastIndex(input, x, 0);
    }

    private static int findLastIndex(int[] input, int x, int startIndex) {
        int index = -1;
        if(startIndex >= input.length-1){
            if(input[startIndex] == x){
                return startIndex;
            }
            return -1;
        }
        int smallAnsIndex = findLastIndex(input, x, startIndex+1);
        if(smallAnsIndex > index){
            return smallAnsIndex;
        }
        if(input[startIndex]==x){
            index = startIndex;
        }
        return index;
    }
}
