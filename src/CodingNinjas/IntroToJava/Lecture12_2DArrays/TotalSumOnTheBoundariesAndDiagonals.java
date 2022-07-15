package codingNinjas.IntroToJava.Lecture12_2DArrays;

import java.util.Scanner;

public class TotalSumOnTheBoundariesAndDiagonals {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[][] arr = takeInput();
            totalSum(arr);
            t -= 1;
        }
    }

    public static int[][] takeInput(){
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i < n;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void totalSum(int[][] mat) {
        if (mat.length==0){
            System.out.println(0);
            return;
        }
       int sum = 0;
       sum += getRowSum(0,mat);
       sum += getRowSum(mat.length - 1, mat);
       sum += getColSum(0, mat);
       sum += getColSum(mat.length - 1, mat);

        for (int i = 0; i <mat.length ; i++) {
            if(mat[i][i] != Integer.MIN_VALUE){
                sum+=mat[i][i];
                mat[i][i] = Integer.MIN_VALUE;
            }
        }
        int i=0;int j=mat.length-1;
        while(i < mat.length){
            if(mat[i][j] != Integer.MIN_VALUE){
                sum+=mat[i][j];
                mat[i][j] = Integer.MIN_VALUE;
            }
            i++;
            j--;
        }
        System.out.println(sum);
    }

    public static int  getRowSum(int row, int[][] mat) {
        int sum=0;
        for (int i = 0; i < mat[0].length; i++) {
            if(mat[row][i] != Integer.MIN_VALUE){
                sum+=mat[row][i];
                mat[row][i] = Integer.MIN_VALUE;
            }
        }
        return sum;
    }

    public static int  getColSum(int col, int[][] mat) {
        int sum=0;
        for (int i = 0; i < mat[0].length; i++) {
            if(mat[i][col] != Integer.MIN_VALUE){
                sum+=mat[i][col];
                mat[i][col] = Integer.MIN_VALUE;
            }
        }
        return sum;
    }
}
