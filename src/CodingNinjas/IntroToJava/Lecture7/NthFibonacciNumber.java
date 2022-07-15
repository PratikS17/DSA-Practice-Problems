package codingNinjas.IntroToJava.Lecture7;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1 || n ==2){
            System.out.println(1);
            return;
        }
        int a=1;int b=1;
        for(int i=3;i<=n;i++){
            int temp = b;
            b = a + b;
            a=temp;
        }
        System.out.println(b);
    }
}
