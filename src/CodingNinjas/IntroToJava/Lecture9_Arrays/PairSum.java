package codingNinjas.IntroToJava.Lecture9_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t > 0) {
            int[] arr1 = takeInput();
            int x = sc.nextInt();
            System.out.println(pairSum(arr1,x));

            t -= 1;
        }
    }

    public static int pairSum(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == x){
                    count++;
                }
            }
        }
        return count;
    }

    public static int pairSum2(int arr[], int num){

        Arrays.sort(arr);
        int numPair =0;
        int startIndex = 0;
        int endIndex = arr.length-1;

        while(startIndex < endIndex){
            if(arr[startIndex] + arr[endIndex] > num){
                endIndex--;
            }else if(arr[startIndex] + arr[endIndex] < num){
                startIndex++;
            }else{

                if(arr[startIndex] == arr[endIndex]){
                    int totalElementsFromStartToEnd = (endIndex - startIndex) + 1;
                    numPair += (totalElementsFromStartToEnd * (totalElementsFromStartToEnd-1))/2;
                    return numPair;
                }
                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;
                while(tempStartIndex <= tempEndIndex && arr[startIndex] == arr[tempStartIndex]){
                    tempStartIndex++;
                }

                while(tempEndIndex >= tempStartIndex && arr[endIndex] == arr[tempEndIndex]){
                    tempEndIndex--;
                }

                int totalElementsFromStart = tempStartIndex - startIndex;
                int totalElementsFromEnd = endIndex - tempEndIndex;

                numPair += (totalElementsFromStart * totalElementsFromEnd);

                startIndex = tempStartIndex;
                endIndex = tempEndIndex;
            }
        }
        return numPair;
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
