package codingNinjas.DSA.Lecture3_Recursion1;

import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countZerosRec(n));
    }

    public static int countZerosRec(int input){
        if(input <= 9){
            return  input != 0 ? 0 : 1;
        }
        int remainder = input % 10;
        input = input /10;

        if(remainder==0){
            return 1 + countZerosRec(input);
        }
        return countZerosRec(input);
    }
}
