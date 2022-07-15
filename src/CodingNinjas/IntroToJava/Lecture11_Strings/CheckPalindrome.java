package codingNinjas.IntroToJava.Lecture11_Strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String str) {
        int median = str.length()/2;
        for (int i = 0; i < median ; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
