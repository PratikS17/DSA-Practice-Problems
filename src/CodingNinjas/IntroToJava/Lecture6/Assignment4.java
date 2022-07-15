package codingNinjas.IntroToJava.Lecture6;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i <= n){
            int start = 2 * i -1;
            System.out.print(start);
            int j=1;
            while(j <= n - i){
                start += 2;
                System.out.print(start);
                j++;
            }
            j=1;
            start = 1;
            while(j <= i - 1){
                System.out.print(start);
                start += 2;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
