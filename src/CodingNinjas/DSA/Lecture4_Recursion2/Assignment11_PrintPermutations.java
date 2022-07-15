package codingNinjas.DSA.Lecture4_Recursion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment11_PrintPermutations {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        FindPermutations(str);
    }

    public static void FindPermutations(String str) {
        printPermutations(str, "");
    }

    private static void printPermutations(String str, String outputStr) {
        if(str.length()==0){
            System.out.println(outputStr);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            String subString="";
            if(i==0){
                subString = str.substring(1);
            }else if(i==str.length()-1){
                subString = str.substring(0,i);
            }
            else{
                subString = str.substring(0,i) + str.substring(i+1);
            }

            printPermutations(subString, str.charAt(i) + outputStr);
        }
    }
}
