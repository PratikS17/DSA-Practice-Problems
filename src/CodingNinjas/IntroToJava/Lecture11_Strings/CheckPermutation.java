package codingNinjas.IntroToJava.Lecture11_Strings;

import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isPermutation(str1,str2));
    }

    public static boolean isPermutation(String str1, String str2) {
        int[] visitedArr = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            visitedArr[str1.charAt(i) - 97] +=1;
        }
        for (int i = 0; i < str2.length(); i++) {
            visitedArr[str2.charAt(i) - 97] -=1;
        }
        for (int i = 0; i < visitedArr.length; i++) {
            if(visitedArr[i] != 0)
                return false;
        }
        return true;
    }
}
