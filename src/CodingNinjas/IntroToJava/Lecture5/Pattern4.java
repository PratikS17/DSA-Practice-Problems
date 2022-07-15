package codingNinjas.IntroToJava.Lecture5;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int startNum = i;
            while(j<=i){
                System.out.print(startNum);
                startNum--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
