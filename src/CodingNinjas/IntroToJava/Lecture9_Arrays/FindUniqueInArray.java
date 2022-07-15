package codingNinjas.IntroToJava.Lecture9_Arrays;

import java.util.Scanner;

public class FindUniqueInArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t > 0) {
            int[] input = takeInput();
            System.out.println(findUnique(input));

            t -= 1;
        }
    }
    public static int findUnique(int[] arr){

        for(int i=0;i<arr.length;i++){
            boolean isUnique =true;
            for (int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                if(arr[i] == arr[j]){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                return arr[i];
            }
        }
        return 0;
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
