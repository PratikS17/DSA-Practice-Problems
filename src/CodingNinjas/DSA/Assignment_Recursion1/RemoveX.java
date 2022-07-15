package codingNinjas.DSA.Assignment_Recursion1;

import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(removeX(input));
    }

    public static String removeX(String input){
        return removeXRecursively(input, 0);
    }

    private static String removeXRecursively(String input, int startIndex) {
        if(startIndex==input.length()){
            return "";
        }
        if(input.charAt(startIndex) == 'x'){
            return "" + removeXRecursively(input,startIndex+1);
        }
        return input.charAt(startIndex) + removeXRecursively(input,startIndex+1);
    }


}
