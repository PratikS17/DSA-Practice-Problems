package codingNinjas.IntroToJava.Lecture10_Arrays2;

import java.util.Scanner;

public class PushZerosToEnd {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[] arr = takeInput();
            pushZerosAtEnd2(arr);
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

    public static void pushZerosAtEnd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]!=0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
    }
    public static void pushZerosAtEnd2(int[] arr) {
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp=arr[i];
                 arr[i]=arr[k];
                 arr[k]=temp;
                 k++;
            }
        }
    }
}
