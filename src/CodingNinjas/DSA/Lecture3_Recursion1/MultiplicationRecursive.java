package codingNinjas.DSA.Lecture3_Recursion1;

import java.util.Scanner;

public class MultiplicationRecursive {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(multiplyTwoIntegers(m, n));
    }

    public static int multiplyTwoIntegers(int m, int n){
        if(m==0 || n==0){
            return 0;
        }else if(n==1){
            return m;
        }

        return m + multiplyTwoIntegers(m , n-1);
    }

}
