package codingNinjas.IntroToJava.Lecture10_Arrays2;

import java.util.Scanner;

public class MergeTwoSortedArrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[] arr1 = takeInput();
            int[] arr2 = takeInput();
            printArray(merge(arr1,arr2));
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

    public static int[] merge(int arr1[], int arr2[]) {
        int[] ans = new int[arr1.length + arr2.length];
        int i,j;
        i=j=0;
        if(arr1.length==0){
            for (int k = 0; k < ans.length; k++) {
                ans[k]= arr2[k];
            }
            return ans;
        }else if(arr2.length==0){
            for (int k = 0; k < ans.length; k++) {
                ans[k]= arr1[k];
            }
            return ans;
        }else{
            for (int k = 0; k < ans.length; k++) {
                if(arr1[i] > arr2[j]){
                    ans[k] = arr2[j];
                    j++;
                }else{
                    ans[k] = arr1[i];
                    i++;
                }
                while(i==arr1.length && k < ans.length && j <arr2.length){
                    k++;
                    ans[k] = arr2[j];
                    j++;

                }
                while(j==arr2.length && k < ans.length && i <arr1.length){
                    k++;
                    ans[k] = arr1[i];
                    i++;
                }
            }
            return ans;
        }
    }
}
