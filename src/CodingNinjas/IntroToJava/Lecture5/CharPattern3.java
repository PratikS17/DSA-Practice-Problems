package codingNinjas.IntroToJava.Lecture5;

import java.util.Scanner;

public class CharPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char startChar = (char)('A' + n - i);
            while(j<=i){
                System.out.print((char)(startChar + j - 1));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
