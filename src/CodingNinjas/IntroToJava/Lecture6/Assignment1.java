package codingNinjas.IntroToJava.Lecture6;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int n1=n;
        int n2=n-1;
        System.out.println("*");
        while(i<=n1) {
            System.out.print("*");
            if (i == 1) {
                System.out.print(i);
            } else {
                int j = 1;
                while (j <= i) {
                    System.out.print(j);
                    j++;
                }
                j=i;
                while (j != 1) {
                    j--;
                    System.out.print(j);
                }
            }
            System.out.print("*");
            System.out.println();
            i++;
        }
        i=n2;
        while(i>0){
            System.out.print("*");
            if (i == 1) {
                System.out.print(i);
            }else{
                int j = 1;
                while (j <= i) {
                    System.out.print(j);
                    j++;
                }
                j=i;
                while (j != 1) {
                    j--;
                    System.out.print(j);
                }
            }
            System.out.print("*");
            System.out.println();
            i--;
        }
        System.out.println("*");
    }
}
