package codingNinjas.IntroToJava.Lecture10_Arrays2;

import java.util.Scanner;

public class RotateArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[] arr = takeInput();
            int d = sc.nextInt();
            rotate(arr,d);
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
    private static int[] rotate(int[] arr, int d) {
        if(arr.length==0 || arr.length==1)
            return arr;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-1-d);
        reverse(arr,arr.length-d,arr.length-1);
        return  arr;
    }

    private static void reverse(int[] nums, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
