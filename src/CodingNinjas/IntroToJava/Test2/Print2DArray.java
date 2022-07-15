package codingNinjas.IntroToJava.Test2;

import java.util.Scanner;

public class Print2DArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[][] arr = takeInput();
            print2DArray(arr);
            t -= 1;
        }
    }

    public static int[][] takeInput(){
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0;i < rows;i++){
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void print2DArray(int input[][]) {

        int count = input.length;
        for (int i = 0; i < input.length; i++) {
            printRowNumberOfTimes(i, count,input);
            count--;
        }

    }

    public static void printRowNumberOfTimes(int rowIndex, int times, int[][] input){
        while(times!=0){
            for (int j = 0; j < input[rowIndex].length; j++) {
                System.out.print(input[rowIndex][j]+" ");
            }
            System.out.println();
            times--;
        }
    }
}
