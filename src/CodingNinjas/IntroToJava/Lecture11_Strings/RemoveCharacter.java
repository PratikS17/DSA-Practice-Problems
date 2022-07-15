package codingNinjas.IntroToJava.Lecture11_Strings;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c = sc.next();
        System.out.println(removeAllOccurrencesOfChar(s,c.charAt(0)));
    }

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String ans="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=ch){
                ans += str.charAt(i);
            }
        }
        return ans;
    }

}
