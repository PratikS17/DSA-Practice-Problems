package codingNinjas.IntroToJava.Lecture9_Arrays;

import java.util.Scanner;

public class ReturnArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--!=0){
            int size=sc.nextInt();
            int[] arr = takeInput(size);

            int sum=0;
            for(int i=0;i < size;i++){
                sum += arr[i];
            }
            System.out.println(sum);
        }

    }

    public static int[] takeInput(int size){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i=0;i < size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
