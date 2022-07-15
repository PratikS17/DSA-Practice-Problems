package codingNinjas.IntroToJava.Lecture12_2DArrays;

import java.util.Scanner;

public class LargestRowOrColumn {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[][] arr = takeInput();
            findLargest(arr);
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

    public static void findLargest(int mat[][]){
        int largestRowSum = Integer.MIN_VALUE;
        int largestColSum = Integer.MIN_VALUE;
        int largestRowSumIndex=0;
        int largestColSumIndex=0;

        if (mat.length==0){
            System.out.println("row "+largestRowSumIndex+" "+largestRowSum);
            return;
        }

        for (int i = 0; i < mat.length; i++) {
            int sum=0;
            for (int j = 0; j < mat[i].length; j++) {
                sum+=mat[i][j];
            }
            if(sum > largestRowSum){
                largestRowSum = sum;
                largestRowSumIndex=i;
            }
        }

        for (int j = 0; j < mat[0].length; j++) {
            int sum=0;
            for (int i = 0; i < mat.length; i++) {
                sum+=mat[i][j];
            }
            if(sum > largestColSum){
                largestColSum = sum;
                largestColSumIndex=j;
            }
        }

        if(largestRowSum >= largestColSum){
            System.out.println("row "+largestRowSumIndex+" "+largestRowSum);
        }
        else {
            System.out.println("column "+largestColSumIndex+" "+largestColSum);
        }
    }
}
