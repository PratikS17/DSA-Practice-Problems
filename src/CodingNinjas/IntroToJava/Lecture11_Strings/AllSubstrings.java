package codingNinjas.IntroToJava.Lecture11_Strings;

import java.util.Scanner;

public class AllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printSubstrings(s);
    }

    public static void printSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                System.out.println(str.substring(i,j+1));
            }
        }
    }

    public static void printSubstrings2(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.println(str.substring(j,j + (str.length() -i)));
            }
        }
    }
    //using Len, find the end
    public static void printSubstrings3(String str) {
        for (int len = 1; len <= str.length(); len++) {
            for (int start = 0; start <=str.length() - len ; start++) {
                int end = start + len -1;
                System.out.println(str.substring(start,end+1));
            }
        }
    }
}
