package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class Assignment3_BinarySearchRecursively {

    static Scanner s = new Scanner(System.in);
    public static int[] takeInput() {
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int element = s.nextInt();
        System.out.println(binarySearch(input, element));
    }

    public static int binarySearch(int input[], int element) {
        return binarySearch(input,0, input.length-1, element);
    }

    private static int binarySearch(int input[],int start, int end, int element) {
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(input[mid] == element){
            return mid;
        }
        if(element < input[mid]){
            return binarySearch(input, start, mid-1, element);
        }
        return binarySearch(input, mid+1, end, element);

    }
}
