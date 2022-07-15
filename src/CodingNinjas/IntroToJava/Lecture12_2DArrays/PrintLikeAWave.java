package codingNinjas.IntroToJava.Lecture12_2DArrays;

import java.util.Scanner;

public class PrintLikeAWave {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[][] arr = takeInput();
            wavePrint(arr);
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

    public static void wavePrint(int mat[][]){

        if (mat.length==0){
            return;
        }

        for (int j = 0; j < mat[0].length ; j++) {
            if(j % 2 == 0){
                for (int i = 0; i < mat.length; i++) {
                    System.out.print(mat[i][j]+" ");
                }
            }
            else{
                for (int i = mat.length-1; i >= 0 ; i--) {
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }
}
