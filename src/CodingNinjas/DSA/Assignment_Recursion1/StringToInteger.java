package codingNinjas.DSA.Assignment_Recursion1;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(convertStringToInt(input));
    }

    public static int convertStringToInt(String input){
        return convertStringToIntRecursive(input,0, input.length()-1);
    }

    private static int convertStringToIntRecursive(String input, int startDegree, int lastIndex) {
        if(startDegree == input.length()){
            return 0;
        }

        int currentInt = input.charAt(lastIndex) - '0';
        return (int) ((currentInt * Math.pow(10, startDegree)) + convertStringToIntRecursive(input, startDegree + 1, lastIndex-1));
    }


}
