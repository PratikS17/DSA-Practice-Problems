package codingNinjas.IntroToJava.Lecture10_Arrays2;

import java.util.Scanner;

public class SecondLargestInArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[] arr = takeInput();
            System.out.println(secondLargestElement(arr));

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

    public static int secondLargestElement(int[] arr) {
        int i, first, second;

        // There should be atleast two elements

        int largest = second = Integer.MIN_VALUE;

        // Find the largest element
        for (i = 0; i < arr.length; i++) {
            largest = arr[i] > largest ? arr[i] : largest;
        }

        // Find the second largest element
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != largest)
                second = arr[i] > second ? arr[i] : second;
        }
        return second;
    }

}
