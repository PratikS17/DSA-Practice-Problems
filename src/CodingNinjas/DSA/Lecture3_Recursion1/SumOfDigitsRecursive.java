package codingNinjas.DSA.Lecture3_Recursion1;

import java.util.Scanner;

public class SumOfDigitsRecursive {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sumOfDigits(n));
    }

    public static int sumOfDigits(int input){
        if(input <=9){
            return input;
        }
        int remainder = input % 10;
        input = input /10;
        return remainder + sumOfDigits(input);
    }
}
