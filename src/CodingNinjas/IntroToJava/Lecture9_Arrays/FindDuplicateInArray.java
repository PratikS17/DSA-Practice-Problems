package codingNinjas.IntroToJava.Lecture9_Arrays;

import java.util.Scanner;

public class FindDuplicateInArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t > 0) {
            int[] input = takeInput();
            //System.out.println(duplicateNumber(input));
            System.out.println(duplicateNumber2(input));

            t -= 1;
        }
    }

    public static int duplicateNumber(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }
    public static int duplicateNumber2(int arr[]) {
        int uniqueNumbersCount= arr.length-2;
        int sumOfUniqueNumbers = (uniqueNumbersCount * (uniqueNumbersCount + 1))/2;
        int sumOfArrayElements = 0;
        for(int i=0;i<arr.length;i++){
            sumOfArrayElements +=arr[i];
        }
        return sumOfArrayElements - sumOfUniqueNumbers;
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
