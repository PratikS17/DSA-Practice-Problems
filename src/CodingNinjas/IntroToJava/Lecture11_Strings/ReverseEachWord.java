package codingNinjas.IntroToJava.Lecture11_Strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseEachWord2(s));;
    }

    public static String reverseEachWord(String input) {
        int start,end;
        start=end=0;
        int i=0;
        while(i<input.length()){
            if(input.charAt(i) == ' '){
                end = i-1;
                input = reverse(start, end, input);
                start = i+1;
            }
            i++;
        }
        input = reverse(start, i-1, input);
        return input;
    }

    private static String reverse(int start , int end, String input) {
        StringBuffer stringBuffer = new StringBuffer(input);
        while(start < end){
            char temp = input.charAt(start);
            stringBuffer.setCharAt(start, input.charAt(end));
            stringBuffer.setCharAt(end, temp);
            start++;
            end--;
        }
        return stringBuffer.toString();
    }

    public static String reverseEachWord2(String str) {
        int currentWordStart = 0;
        String finalString ="";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = "";
            if (str.charAt(i) == ' '){
                int currentWordEnd = i -1;
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    result = str.charAt(j) + result;
                }
                finalString = finalString +result +" ";
                currentWordStart = i+1;
            }
        }
        for (int j = currentWordStart; j < str.length(); j++) {
            result = str.charAt(j) + result;
        }
        finalString = finalString +result;
        return finalString;
    }

}
