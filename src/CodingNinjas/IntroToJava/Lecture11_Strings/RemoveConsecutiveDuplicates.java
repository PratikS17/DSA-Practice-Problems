package codingNinjas.IntroToJava.Lecture11_Strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeConsecutiveDuplicates(str));
    }
    public static String removeConsecutiveDuplicates(String str) {
        char prev = str.charAt(0);
        String result = "" + prev;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == prev){
                continue;
            }else{
                prev = str.charAt(i);
                result = result + prev;
            }
        }
        return result;
    }
}
