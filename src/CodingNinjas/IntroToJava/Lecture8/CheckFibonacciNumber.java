package codingNinjas.IntroToJava.Lecture8;

import java.util.Scanner;

public class CheckFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkMember(n));

    }

    public static boolean checkMember(int n){

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if(n==1 || n ==2){
            return true;
        }
        int a=1;int b=1;
        while(b < n){
            int temp = b;
            b = a + b;
            a=temp;
            if(b == n)
                return true;
        }
        return false;
    }

}
