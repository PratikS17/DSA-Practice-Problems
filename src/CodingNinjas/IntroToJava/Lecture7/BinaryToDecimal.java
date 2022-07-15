package codingNinjas.IntroToJava.Lecture7;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int i=0;
        while(n!=0){
            int remainder = n %10;
            n = n/10;
            if(remainder!=0){
                int p=i;
                int product=1;
                while(p!=0){
                    product *= 2;
                    p--;
                }
                sum += (remainder * product);
            }
            i++;
        }
        System.out.println(sum);
    }
}
