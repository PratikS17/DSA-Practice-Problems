package codingNinjas.DSA.Lecture3_Recursion1;

import java.util.Scanner;

public class CheckPalindromeRecursive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(isStringPalindrome(input));
    }

    public static boolean isStringPalindrome(String input) {
        int median = input.length()/2;
        //return checkPalindrome(input, 0 , median);
        return checkPalindrome2(input, 0 , input.length()-1);
    }

    private static boolean checkPalindrome(String input, int currentIndex, int median) {
        if(currentIndex > median){
            return true;
        }
        if(input.charAt(currentIndex) != input.charAt(input.length() - 1 -currentIndex)){
            return false;
        }
        return checkPalindrome(input, currentIndex+1, median);
    }

    private static boolean checkPalindrome2(String input, int start, int end) {
        if(start > end){
            return true;
        }
        if(input.charAt(start) != input.charAt(end)){
            return false;
        }
        return checkPalindrome2(input, start+1, end-1);
    }
}
