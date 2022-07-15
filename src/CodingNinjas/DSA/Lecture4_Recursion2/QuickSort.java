package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class QuickSort {

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        quickSort(input);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void quickSort(int[] input) {
        quickSort(input, 0 , input.length-1);
    }

    private static void quickSort(int[] input, int start, int end) {
        if(start >= end){
            return;
        }
        int pivotPos = partition(input, start, end);
        quickSort(input, start, pivotPos-1);
        quickSort(input, pivotPos+1, end);
    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int numOfEleLessThenPivot = 0;
        for (int i = start+1; i <=end ; i++) {
            if(input[i] <= pivot){
                numOfEleLessThenPivot++;
            }
        }
        int pivotPos = start + numOfEleLessThenPivot;
        swap(input, start, pivotPos);
        int i = start;
        int j = end;
        while(i < pivotPos && j > pivotPos){
            if(input[i] > pivot){
                if(input[j] > pivot){
                    j--;
                    continue;
                }
                swap(input, i, j);
            }
            i++;
        }
        return pivotPos;
    }

    public static void swap(int[] input, int i, int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
