package codingNinjas.IntroToJava.Test1;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number=n;
        int sum=0;
        int digitsCount=0;
        while(n!=0){
            n = n/10;
            digitsCount++;
        }
        n=number;
        while(n!=0){
            int remainder = n % 10;
            n = n/10;
            sum += getNthPower(remainder, digitsCount);
        }
        if (number == sum){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    private static int getNthPower(int remainder,int digitsCount) {
        int product=1;
        for (int i = 0; i < digitsCount; i++) {
            product *= remainder;
        }
        return product;
    }
}
