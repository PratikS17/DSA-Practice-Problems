package codingNinjas.IntroToJava.Lecture7;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isUnitPlace = true;
        while(n!=0){
            int remainder = n % 10;
            n = n/10;
            if(remainder==0 && isUnitPlace){
                continue;
            }
            isUnitPlace=false;
            System.out.print(remainder);

        }
    }
}
