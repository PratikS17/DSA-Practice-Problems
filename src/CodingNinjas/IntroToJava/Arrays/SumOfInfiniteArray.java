package codingNinjas.IntroToJava.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SumOfInfiniteArray {
    public static void main(String[] args) {
        //int arr[]= {1,2,3};
        int arr[]= {5,2,6,9};
        List<Long> q1 = new ArrayList<>();
        q1.add(1L);
        q1.add(5L);
        List<Long> q2 = new ArrayList<>();
        q2.add(10L);
        q2.add(13L);
        List<Long> q3 = new ArrayList<>();
        q3.add(7L);
        q3.add(11L);
        List<List<Long>> queries= new ArrayList<>();
        queries.add(q1);
        queries.add(q2);
        queries.add(q3);

        System.out.println(sumInRanges(arr, arr.length, queries, 3));
    }
    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        int computeArr[] = new int[n+1];
        int sumOfArray[] = new int[n+1];
        int mod = (int) 1e9 + 7;

        for (int i =1; i< computeArr.length;i++) {
            computeArr[i] = arr[i - 1];
            sumOfArray[i] = (sumOfArray[i-1] + computeArr[i]) % mod;
        }

        List<Integer> finalAns = new ArrayList<>();
        int queryCount=0;
        while(q--!=0){
            List<Long> leftRightList = queries.get(queryCount);
            long left = leftRightList.get(0)-1;
            long right = leftRightList.get(1);

            long rightDivisor = (right / n) % mod;
            long rightRemainder = right % n;

            long leftDivisor = (left / n) % mod;
            long leftRemainder = left % n;

            long ans=0;
            ans = ((sumOfArray[(int) (rightRemainder)] + rightDivisor * sumOfArray[sumOfArray.length-1]) % mod) -
                    ((sumOfArray[(int) (leftRemainder)] + leftDivisor * sumOfArray[sumOfArray.length-1]) % mod);

             finalAns.add((int) ((ans + mod) % mod));
             queryCount++;
        }
        return finalAns;
    }
}
