package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class AllSubsequencesRecursively {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] subsequences = getSubSequences(s);
        for (int i = 0; i < subsequences.length; i++) {
            System.out.println(subsequences[i]);
        }
    }

    private static String[] getSubSequences(String s) {
        if (s.length()==0){
            String[] subSequences = new String[1];
            subSequences[0] = "";
            return subSequences;
        }

        String[] smallAnsSubSequences = getSubSequences(s.substring(1));
        String[] finalSubSequences = new String[smallAnsSubSequences.length * 2];
        for (int i = 0; i < smallAnsSubSequences.length; i++) {
            finalSubSequences[i] = s.charAt(0) + smallAnsSubSequences[i];
        }
        for (int i = smallAnsSubSequences.length; i < finalSubSequences.length; i++) {
            finalSubSequences[i] = smallAnsSubSequences[i - smallAnsSubSequences.length];
        }
        return finalSubSequences;
    }
}
