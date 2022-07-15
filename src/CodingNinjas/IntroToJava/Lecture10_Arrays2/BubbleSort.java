package codingNinjas.IntroToJava.Lecture10_Arrays2;

import java.util.Scanner;

public class BubbleSort {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[] arr = takeInput();
            bubbleSort(arr);
            printArray(arr);
            t -= 1;
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

    public static void bubbleSort(int[] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if(arr[j]  > arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}
