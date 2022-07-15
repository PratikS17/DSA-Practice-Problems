package codingNinjas.DSA.Lecture3_Recursion1;

import java.util.Scanner;

public class FirstIndexOfNumber {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = s.nextInt();
        System.out.println(firstIndex(input, x));
    }

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static int firstIndex(int input[], int x) {
       return findFirstIndex(input, x, 0);
    }

    private static int  findFirstIndex(int[] input, int x, int startIndex) {
        if(startIndex >= input.length-1){
            if(input[startIndex] == x){
                return startIndex;
            }
            return -1;
        }
        if(input[startIndex]==x){
            return startIndex;
        }
        return findFirstIndex(input, x, startIndex+1);
    }


}
