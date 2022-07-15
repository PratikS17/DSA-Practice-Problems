package codingNinjas.IntroToJava.Lecture10_Arrays2;

import java.util.Scanner;

public class CodeBinarySearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = takeInput();
        int t = sc.nextInt();
        while(t > 0) {
            int x = sc.nextInt();
            System.out.println(binarySearch(arr,x));
            t -= 1;
        }
    }

    public static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(x == arr[mid]){
                return mid;
            }else if(x < arr[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }

    public static int[] takeInput(){
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i < size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
