package codingNinjas.IntroToJava.Test2;

import java.util.Scanner;

public class MinimumLengthWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(minLengthWord(s));
    }

    public static String minLengthWord(String input){

        int minLength = Integer.MAX_VALUE;
        int count=0;
        String minLengthString = "";
        int start = 0;
        int i=0;
        for (i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' '){
                if(count < minLength){
                    minLength = count;
                    minLengthString = input.substring(start, i);
                    continue;
                }
                count=0;
                start = i+1;
            }
            count++;
        }
        if(count < minLength){
            minLengthString = input.substring(start, i);
        }
        return minLengthString;
    }
}
