package codingNinjas.IntroToJava.Lecture9_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t > 0) {
            int[] arr1 = takeInput();
            int[] arr2 = takeInput();
            //System.out.println(duplicateNumber(input));
            intersections2(arr1,arr2);

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

    public static void intersections(int arr1[], int arr2[]) {
        for (int i=0;i< arr1.length;i++){
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static void intersections2(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
    }




}
