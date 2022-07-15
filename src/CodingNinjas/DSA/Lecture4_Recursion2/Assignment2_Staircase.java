package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class Assignment2_Staircase {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(staircase(n));
    }

    public static int staircase(int n){
        return staircase(n, 0,0);

    }

    private static int staircase(int finalStep, int currentStep, int count) {
        if(currentStep >= finalStep){
            return currentStep == finalStep ? ++count : count;
        }

        count = staircase(finalStep, currentStep+1, count);
        count = staircase(finalStep, currentStep+2, count);
        count = staircase(finalStep, currentStep+3, count);
        return count;
    }
}
