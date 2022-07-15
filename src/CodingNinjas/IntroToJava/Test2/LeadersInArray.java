package codingNinjas.IntroToJava.Test2;

import java.util.Scanner;

public class LeadersInArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = takeInput();
        leaders(arr);
    }

    public static int[] takeInput(){
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i < size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void leaders(int[] input) {

        for (int i = 0; i < input.length; i++) {
            boolean isLeader = true;
            for (int j = i+1; j < input.length; j++) {
                if(input[j] > input[i]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                System.out.print(input[i]+" ");
            }
        }
    }
}
