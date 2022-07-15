package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class PrintAllSubsequences {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printSubSequences(s);

    }

    private static void printSubSequences(String s) {
        printSubSequences(s, "");
    }

    private static void printSubSequences(String s, String outputStr) {
        if(s.length()==0){
            System.out.println(outputStr);
            return;
        }

        printSubSequences(s.substring(1), outputStr);
        printSubSequences(s.substring(1), outputStr + s.charAt(0));
    }
}
