package codingNinjas.IntroToJava.Lecture7;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long placeValue = 1;
        long ans = 0;
        while(n!=0){
            int remainder = n % 2;
            n = n/2;
            ans += (placeValue * remainder);
            placeValue = placeValue * 10;
        }
        System.out.println(ans);
    }
}
