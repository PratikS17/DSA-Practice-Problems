package codingNinjas.IntroToJava.Lecture10_Arrays2;

import java.util.Scanner;

public class SumOfTwoArrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[] arr1 = takeInput();
            int[] arr2 = takeInput();
            int[] output = new int[1 + Math.max(arr1.length, arr2.length)];
            sumOfTwoArrays(arr1,arr2,output);
            printArray(output);
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

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int i,j,k;
        i=arr1.length-1;
        j=arr2.length-1;
        k=output.length-1;
        int carry=0;
        while(i >= 0 && j >= 0){
            int ans= (carry + arr1[i]+ arr2[j]) % 10;
            carry = (carry + arr1[i]+ arr2[j]) / 10;
            output[k] = ans;
            i--;j--;k--;
        }
        while(i>=0){
            output[k] = (carry + arr1[i]) % 10;
            carry = (carry + arr1[i]) / 10;
            k--;i--;
        }
        while(j>=0){
            output[k] = (carry + arr2[j]) % 10;
            carry = (carry + arr2[j]) / 10;
            k--;j--;
        }
        output[k] =carry;
    }
}
