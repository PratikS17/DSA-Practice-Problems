package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class ReplaceCharacterRecursively {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        char c1 = s.next().charAt(0);
        char c2 = s.next().charAt(0);
        System.out.println(replaceCharacter(input, c1, c2));
    }

    public static String replaceCharacter(String input, char c1, char c2) {
        if(input.length()==0){
            return input;
        }

        char ans = input.charAt(0);
        if(input.charAt(0) == c1){
            ans = c2;
        }
        return ans + replaceCharacter(input.substring(1), c1, c2);
    }
}
