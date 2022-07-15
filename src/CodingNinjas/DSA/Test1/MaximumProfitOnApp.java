package codingNinjas.DSA.Test1;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProfitOnApp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i=0;i<n;i++)
            input[i] = s.nextInt();

        System.out.println(maximumProfit(input));
    }

    public static int maximumProfit(int budget[]) {
        Arrays.sort(budget);
        return maximumProfit(budget, 0);

    }

    private static int maximumProfit(int[] budget, int startIndex) {
        if(startIndex == budget.length-1){
            return budget[startIndex];
        }

        int smallAns = maximumProfit(budget, startIndex+1);
        int numOfEligibleSubcribers = budget.length - startIndex;
        int finalAns = numOfEligibleSubcribers * budget[startIndex];
        if(finalAns > smallAns){
            return finalAns;
        }
        return smallAns;
    }
}
