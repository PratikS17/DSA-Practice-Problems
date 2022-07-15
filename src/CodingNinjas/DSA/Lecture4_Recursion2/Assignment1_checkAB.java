package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class Assignment1_checkAB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println(checkAB(input));
    }

    public static boolean checkAB(String input){
        return checkAB(input, input.length());
    }


    public static boolean checkAB(String input,int startStringLength) {

        if(startStringLength == input.length()){
            if(input.charAt(0) != 'a'){
                return false;
            }
        }
        if(input.length()==0){
            return true;
        }

        if(input.charAt(0) == 'a'){
            input = input.substring(1);
            if(input.isEmpty() || input.charAt(0) == 'a' || input.startsWith("bb")){
                 return checkAB(input, startStringLength);
            }
        }
        if(input.startsWith("bb")){
            input = input.substring(2);
            if(input.isEmpty() || input.charAt(0) == 'a'){
                return checkAB(input,startStringLength);
            }
        }
        return false;
    }
}
