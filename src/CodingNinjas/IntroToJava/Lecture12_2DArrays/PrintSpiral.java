package codingNinjas.IntroToJava.Lecture12_2DArrays;

import java.util.Scanner;

public class PrintSpiral {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[][] arr = takeInput();
            spiralPrint(arr);
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

    public static void spiralPrint(int matrix[][]){
        if (matrix.length==0){
            return;
        }
        int numbersPrinted=0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rowStart=0;
        int rowEnd=matrix.length-1;
        int colStart=0;
        int colEnd=matrix[0].length-1;
        while(numbersPrinted < (rows*cols)){
            for (int j = colStart; j <=colEnd; j++) {
                if (matrix[rowStart][j] != Integer.MIN_VALUE){
                    System.out.print(matrix[rowStart][j]+" ");
                    matrix[rowStart][j] = Integer.MIN_VALUE;
                    numbersPrinted++;
                }
            }
            rowStart++;
            for (int i = rowStart; i <=rowEnd; i++) {
                if (matrix[i][colEnd] != Integer.MIN_VALUE){
                    System.out.print(matrix[i][colEnd]+" ");
                    matrix[i][colEnd] = Integer.MIN_VALUE;
                    numbersPrinted++;
                }
            }
            colEnd--;
            for (int i = colEnd; i >=colStart; i--) {
                if (matrix[rowEnd][i] != Integer.MIN_VALUE){
                    System.out.print(matrix[rowEnd][i]+" ");
                    matrix[rowEnd][i] = Integer.MIN_VALUE;
                    numbersPrinted++;
                }
            }
            rowEnd--;
            for (int i = rowEnd; i >=rowStart; i--) {
                if (matrix[i][colStart] != Integer.MIN_VALUE){
                    System.out.print(matrix[i][colStart]+" ");
                    matrix[i][colStart] = Integer.MIN_VALUE;
                    numbersPrinted++;
                }
            }
            colStart++;
        }
    }
}
