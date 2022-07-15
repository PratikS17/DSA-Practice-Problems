package codingNinjas.IntroToJava.Lecture6;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int n1 = (n/2)+1;
        int n2 = n1 - 1;
        while(i <= n1){
            int j=1;
            while(j <= n1 - i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j <= i){
                System.out.print("*");
                j++;
            }
            j=1;
            while(j <= i - 1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i=1;
        while(i <=n2){
            int j=1;
            while(j <= i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j <= n2 - i + 1){
                System.out.print("*");
                j++;
            }
            j=1;
            while(j <= n2 - i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
