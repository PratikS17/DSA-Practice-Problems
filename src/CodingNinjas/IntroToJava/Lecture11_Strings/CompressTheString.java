package codingNinjas.IntroToJava.Lecture11_Strings;

import java.util.Scanner;

public class CompressTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getCompressedString(s));
    }

    public static String getCompressedString(String str) {
        char prev = str.charAt(0);
        int currentRepeatingCharCount = 1;
        String ans="";
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == prev){
                currentRepeatingCharCount++;
            }
            else {
                ans = ans.concat(String.valueOf(prev));
                if (currentRepeatingCharCount > 1){
                    ans = ans.concat(String.valueOf(currentRepeatingCharCount));
                }

                prev = str.charAt(i);
                currentRepeatingCharCount=1;
            }
        }
        ans = ans.concat(String.valueOf(prev));
        if (currentRepeatingCharCount > 1){
            ans = ans.concat(String.valueOf(currentRepeatingCharCount));
        }
        return ans;
    }
}
