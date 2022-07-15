package codingNinjas.IntroToJava.Arrays;

public class MaximumSubarraySumKadaneAlgo {
    public static void main(String[] args) {
        //int[] arr={10, 20, -30, 40, -50, 60};
        //int[] arr={1, 2, 7, -4, 3 ,2, -10, 9, 1};
        //int[] arr={};
        int[] arr={-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10};

        System.out.println(maxSubarraySum(arr,arr.length));
    }
    public static long maxSubarraySum(int[] arr, int n) {
        if (n == 0)
            return 0;
        long csum = arr[0];
        long osum = arr[0];

        for(int i=1;i<n;i++){
            if(csum >= 0){
                csum += arr[i];
            }
            else{
                csum =arr[i];
            }
            if(csum > osum)
                osum = csum;
        }
        if(osum < 0)
            return 0;
        return osum;
    }

}
