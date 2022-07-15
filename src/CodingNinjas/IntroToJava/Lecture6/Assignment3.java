package codingNinjas.IntroToJava.Lecture6;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i <= n){
            int j=1;
            while(j < i){
                System.out.print(j + "+");
                j++;
            }
            int ans = (j * (j+1))/2;
            System.out.print(j+"="+ans);
            System.out.println();
            i++;
        }
    }
}
