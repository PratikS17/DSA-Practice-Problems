package codingNinjas.IntroToJava.Lecture10_Arrays2;

import java.util.Scanner;

public class CheckArrayRotation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t > 0) {
            int[] arr = takeInput();
            System.out.println(arrayRotateCheck(arr));
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

    public static int arrayRotateCheck(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
                count++;
                continue;
            }
            break;
        }
        if(count==arr.length-1)
            return 0;
        return count+1;
    }

}
