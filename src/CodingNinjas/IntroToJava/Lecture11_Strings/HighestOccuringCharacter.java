package codingNinjas.IntroToJava.Lecture11_Strings;

import java.util.Scanner;

public class HighestOccuringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(highestOccuringChar(s));
    }

    public static char highestOccuringChar(String str) {
        int[] freqArray = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freqArray[str.charAt(i) - 97] += 1;
        }
        int maxCount = freqArray[0];
        int maxCountIndex = 0;
        for (int i = 1; i < freqArray.length; i++) {
            if(freqArray[i] > maxCount){
                maxCount = freqArray[i];
                maxCountIndex = i;
            }
        }
        return (char)(maxCountIndex+97);
    }
}
