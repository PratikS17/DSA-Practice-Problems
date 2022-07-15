package codingNinjas.IntroToJava.Lecture6;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j <= n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            int startNumber = i;
            while(j <= i){
                System.out.print(startNumber);
                startNumber++;
                j++;
            }
            j=1;
            startNumber = 2 * (i-1);
            while(j <= i - 1){
                System.out.print(startNumber);
                startNumber--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
