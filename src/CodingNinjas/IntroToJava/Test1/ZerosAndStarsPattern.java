package codingNinjas.IntroToJava.Test1;

import java.util.Scanner;

public class ZerosAndStarsPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                if(j==i){
                    System.out.print("*");
                }else{
                    System.out.print(0);
                }
                j++;
            }
            System.out.print("*");
            j=n;
            while(j>0){
                if(j==i){
                    System.out.print("*");
                }else{
                    System.out.print(0);
                }
                j--;
            }
            i++;
            System.out.println();
        }
    }
}
