package codingNinjas.IntroToJava.Lecture8;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int step = sc.nextInt();
        printFahrenheitTable(start, end, step);

    }

    public static void printFahrenheitTable(int start, int end, int step) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print the specified output in required format.
         * Taking input is handled automatically.
         */
        do{
            int ans = (5 * (start -32))/9;
            System.out.println(start+"\t"+ans);
            start = start +step;

        }while(start<=end);

    }
}

