package codingNinjas.DSA.Assignment_Recursion1;

import java.util.Scanner;

public class ReplacePiRecursive {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(replace(input));
    }

    public static String replace(String input){
        return replacePi(input, 0);
    }

    private static String replacePi(String input, int startIndex) {
        if(startIndex==input.length()){
            return "";
        }

        if(input.substring(startIndex).startsWith("pi")){
            startIndex = startIndex+2;
            return "3.14" + replacePi(input, startIndex);
        }
        return input.charAt(startIndex) + replacePi(input, startIndex+1);
    }


}
