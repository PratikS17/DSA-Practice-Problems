package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class Assignment9_PrintAllCodesOfString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        printAllPossibleCodes(input);
    }
    public static void printAllPossibleCodes(String input) {

        printAllPossibleCodes(input, "");
    }

    private static void printAllPossibleCodes(String input, String outputStr) {
        if(input.length()==0){
            System.out.println(outputStr);
            return;
        }

        printAllPossibleCodes(input.substring(1), outputStr + getCorrespondingCharacter(Integer.parseInt(input.substring(0,1))));
        if(input.length()<2 || Integer.parseInt(input.substring(0,2)) > 26){
            return;
        }
        printAllPossibleCodes(input.substring(2),  outputStr+getCorrespondingCharacter(Integer.parseInt(input.substring(0,2))));
    }

    private static char getCorrespondingCharacter(int number){
        Character[] characters = new Character[27];
        characters[1] ='a';
        characters[2] ='b';
        characters[3] ='c';
        characters[4] ='d';
        characters[5] ='e';
        characters[6] ='f';
        characters[7] ='g';
        characters[8] ='h';
        characters[9] ='i';
        characters[10] ='j';
        characters[11] ='k';
        characters[12] ='l';
        characters[13] ='m';
        characters[14] ='n';
        characters[15] ='o';
        characters[16] ='p';
        characters[17] ='q';
        characters[18] ='r';
        characters[19] ='s';
        characters[20] ='t';
        characters[21] ='u';
        characters[22] ='v';
        characters[23] ='w';
        characters[24] ='x';
        characters[25] ='y';
        characters[26] ='z';

        return characters[number];

    }
}
