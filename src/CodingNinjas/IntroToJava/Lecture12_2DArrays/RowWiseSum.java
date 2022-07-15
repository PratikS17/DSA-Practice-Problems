package codingNinjas.IntroToJava.Lecture12_2DArrays;

import java.util.Scanner;

public class RowWiseSum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[][] arr = takeInput();
            rowWiseSum(arr);
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

    public static void rowWiseSum(int[][] mat) {

        for(int i=0;i < mat.length;i++){
            int rowWiseSum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                rowWiseSum +=mat[i][j];
            }
            System.out.print(rowWiseSum+" ");
        }
    }
}
