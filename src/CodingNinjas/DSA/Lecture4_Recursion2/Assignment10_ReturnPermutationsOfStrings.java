package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class Assignment10_ReturnPermutationsOfStrings {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String output[] = permutationOfString(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    public static String[] permutationOfString(String input){
        if(input.length()==1){
            String[] s ={input};
            return s;
        }

        String[] finalAns=null;
        int k=0;
        for (int i = 0; i < input.length(); i++) {

            String subString="";
            if(i==0){
                subString = input.substring(1);
            }else if(i==input.length()-1){
                subString = input.substring(0,i);
            }
            else{
                subString = input.substring(0,i) + input.substring(i+1);
            }

            String[] smallAns = permutationOfString(subString);
            if(finalAns==null){
                finalAns = new String[smallAns.length * input.length()];
            }
            for (int j = 0; j < smallAns.length; j++) {
                finalAns[k] = input.charAt(i) + smallAns[j];
                k++;
            }
        }
        return finalAns;
    }
}
