package codingNinjas.IntroToJava.Lecture10_Arrays2;

import java.util.Scanner;

public class Sort012 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[] arr = takeInput();
            sort012old(arr);
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

    public static void sort012old(int[] arr) {
        int i = 0;
        int nextZero = 0;
        int nextTwo = arr.length - 1;
        while (i <= nextTwo) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[nextZero];
                arr[nextZero] = temp;
                nextZero++;
                i++;
            } else if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[nextTwo];
                arr[nextTwo] = temp;
                nextTwo--;
            } else {
                i++;
            }
        }
    }
    public static void sort012(int[] arr) {
        int i = 0;
        int j = 0;
        int n = arr.length - 1;
        int p = 1;
        while( j <= n ){
            if(arr[j] < p){
                swap(arr, i, j);
                i++;
                j++;
            }else if (arr[j] > p){
                swap(arr, j, n);
                n--;
            }else{
                j++;
            }
        }
    }

    static private void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
