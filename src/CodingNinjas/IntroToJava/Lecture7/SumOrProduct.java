package codingNinjas.IntroToJava.Lecture7;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        if(c==1){
            System.out.println((n*(n+1)/2));
        }else if(c==2){
            int product=1;
            for(int i=1;i<=n;i++){
                product *= i;
            }
            System.out.println(product);
        }else{
            System.out.println(-1);
        }
    }
}
