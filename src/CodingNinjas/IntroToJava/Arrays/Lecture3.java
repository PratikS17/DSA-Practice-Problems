package codingNinjas.IntroToJava.Arrays;

import java.util.Scanner;

public class Lecture3 {
    public static void main(String[] args) {
//        int var1 = 5;
//        int var2 = 6;
//        if ((var2 = 1) == var1)
//            System.out.print(var2);
//        else
//            System.out.print(var2 + 1);

//        Scanner sc = new Scanner(System.in);
//        char c = sc.next().charAt(0);
//        if(c >=65 && c<=90)
//            System.out.println(1);
//        else if(c >=97 && c<=122)
//            System.out.println(0);
//        else
//            System.out.println(-1);

//        int x=5;
//        int y=5;
//        while((x=5)==y)
//        {
//            System.out.println("Hello");
//            x++;
//            y++;
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 1;
//        int sum=0;
//        while(i <= n){
//            if(i % 2 == 0 ){
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println(sum);

//        Scanner sc = new Scanner(System.in);
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        int step = sc.nextInt();
//
//        do{
//            int ans = (5 * (start -32))/9;
//            System.out.println(start+"\t"+ans);
//            start = start +step;
//
//        }while(start<=end);

//        double sal=8761.53;
//        System.out.println(Math.round(sal));

//        Scanner sc = new Scanner(System.in);
//        long basic = sc.nextLong();
//        char grade = sc.next().charAt(0);
//
//        double hra = 0.2 * basic ;
//        double da = 0.5 * basic ;
//        double pf = 0.11 * basic ;
//        int allowance;
//        if(grade == 'A')
//            allowance = 1700;
//        else if(grade == 'B')
//            allowance = 1500;
//        else
//            allowance = 1300;
//
//        long finalSal = Math.round(basic + hra + da + allowance - pf);
//        System.out.println(finalSal);

//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int i =1;
//
//        while(i<=10){
//            System.out.println(n * i);
//            i++;
//
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int oddSum,evenSum;
//        oddSum = evenSum = 0;
//
//        while(n!=0){
//            int digit = n%10;
//            if(digit % 2 == 0)
//                evenSum += digit;
//            else
//                oddSum += digit;
//            n = n/10;
//        }
//
//        System.out.println(evenSum + " " + oddSum);

//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int i=2;
//        while(i<n){
//            if(n % i == 0)
//                System.out.print(i+" ");
//            i++;
//        }

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        if(n==0){
            System.out.println(1);
            return;
        }
        long result=1;
        while(n!=0){
            result *= x;
            n--;
        }
        System.out.println(result);


    }
}
