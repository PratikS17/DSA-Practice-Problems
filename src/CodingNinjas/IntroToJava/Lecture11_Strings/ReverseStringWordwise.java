package codingNinjas.IntroToJava.Lecture11_Strings;

import java.util.Scanner;

public class ReverseStringWordwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWordWise(s));
    }

    public static String reverseWordWise(String input) {

        input = reverse(0, input.length()-1,input);
        int start,end;
        start=end=0;
        int i=0;
        while(i<input.length()){
            if(input.charAt(i) == ' '){
                input = reverse(start, i-1, input);
                start = i+1;
            }else if(i == input.length()-1){
                input = reverse(start, i, input);
            }
            i++;
        }
        return input;
    }
    //hg f ed cba
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


}
