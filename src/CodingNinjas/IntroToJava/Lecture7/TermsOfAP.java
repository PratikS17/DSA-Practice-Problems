package codingNinjas.IntroToJava.Lecture7;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int i=1;
        while(count!=n){
            int seriesNum = 3*i + 2;
            if(seriesNum % 4 !=0){
                System.out.print(seriesNum+" ");
                count++;
            }
            i++;
        }
    }
}
