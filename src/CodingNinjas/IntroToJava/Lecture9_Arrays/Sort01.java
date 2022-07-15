package codingNinjas.IntroToJava.Lecture9_Arrays;

import java.util.Scanner;

public class Sort01 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t > 0) {
            int[] arr = takeInput();
            sortZeroesAndOne(arr);
            printArray(arr);

            t -= 1;
        }
    }

    public static void sortZeroesAndOne(int[] arr) {

        int i,j;
        i=0;
        j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
                continue;
            }
            if(arr[j]==1){
                j--;
                continue;
            }
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
    }

    public static int[] takeInput(){
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i < size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
