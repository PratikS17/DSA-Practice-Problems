package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class PrintKeypadCombinationsCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        printKeypad(input);
    }

    public static void printKeypad(int input){
        printKeypad(input, "");

    }

    private static void printKeypad(int input, String outputStr) {
        if(input==0){
            System.out.println(outputStr);
            return;
        }
        int currentNum = input%10;
        Character[] currentNumKeypadCombinations = generateNumberToCharMap(currentNum);
        for (int i = 0; i < currentNumKeypadCombinations.length; i++) {
            printKeypad(input/10, currentNumKeypadCombinations[i] + outputStr);
        }
    }

    private static Character[] generateNumberToCharMap(int n)
    {
        Character[][] numberToCharMap = new Character[10][5];
        numberToCharMap[0] = new Character[]{'\0'};
        numberToCharMap[1] = new Character[]{'\0'};
        numberToCharMap[2] = new Character[]{'a','b','c'};
        numberToCharMap[3] = new Character[]{'d','e','f'};
        numberToCharMap[4] = new Character[]{'g','h','i'};
        numberToCharMap[5] = new Character[]{'j','k','l'};
        numberToCharMap[6] = new Character[]{'m','n','o'};
        numberToCharMap[7] = new Character[]{'p','q','r','s'};
        numberToCharMap[8] = new Character[]{'t','u','v'};
        numberToCharMap[9] = new Character[]{'w','x','y','z'};
        return numberToCharMap[n];
    }
}
