package codingNinjas.DSA.Lecture4_Recursion2;

import java.util.Scanner;

public class ReturnKeypadCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        String output[] = keypad(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    public static String[] keypad(int n){
        if(n==0){
            String[] s = {""};
            return s;
        }
        int currentNum = n%10;
        String[] smallAns = keypad(n/10);
        Character[] currentNumKeypadCombinations = generateNumberToCharMap(currentNum);
        String[] finalAns = new String[smallAns.length * currentNumKeypadCombinations.length];
        int k=0;
        for (int i = 0; i < currentNumKeypadCombinations.length; i++) {
            for (int j = 0; j < smallAns.length; j++) {
                finalAns[k] = smallAns[j] + currentNumKeypadCombinations[i];
                k++;
            }
        }
        return finalAns;
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
