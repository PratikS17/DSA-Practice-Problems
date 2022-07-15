package codingNinjas.IntroToJava.Lecture9_Arrays;

import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--!=0){
            int size=sc.nextInt();
            int[] arr = new int[size];

            arrange(arr, size);
            printArray(arr);
        }
    }

    public static void arrange(int[] arr, int n) {
        //Your code goes here
        if(n==0){
            return;
        }
        int median = n/2;
        arr[median] = n;
        int start=1;
        for(int i=0; i< median; i++){
            arr[i] = start;
            start +=2;
        }
        start =2;
        for(int i=n-1; i> median; i--){
            arr[i] = start;
            start +=2;
        }
    }
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
