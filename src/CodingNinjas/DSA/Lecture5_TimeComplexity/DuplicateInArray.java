package codingNinjas.DSA.Lecture5_TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateInArray {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");


        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            System.out.println(findDuplicate(input));

            t -= 1;
        }
    }

    public static int findDuplicate(int[] arr) {
        int uniqueNumbersCount = arr.length - 2;
        int sumOfUniqueNumbersCount = (uniqueNumbersCount * (uniqueNumbersCount +1))/2;
        int sumOfArrayElements=0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArrayElements += arr[i];
        }
        return sumOfArrayElements - sumOfUniqueNumbersCount;
    }
}
