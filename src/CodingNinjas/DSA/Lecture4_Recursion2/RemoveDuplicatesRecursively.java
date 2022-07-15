package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class RemoveDuplicatesRecursively {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.next();
        System.out.println(removeConsecutiveDuplicates(input));
    }

    public static String removeConsecutiveDuplicates(String s) {
        if(s.length()==1){
            return s;
        }

        String smallAns = removeConsecutiveDuplicates(s.substring(1));
        String ans = "";
        if(s.charAt(0) != smallAns.charAt(0)){
            ans = s.charAt(0) +"";
        }
        return ans + smallAns;

    }
}
