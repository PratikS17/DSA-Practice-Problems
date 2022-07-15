package codingNinjas.IntroToJava.Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[]= {0,1,0};
        //int arr[]= {2,3,4,5};
        System.out.println(Arrays.toString(getProductArrayExceptSelf(arr)));
    }

    public static int[] getProductArrayExceptSelf(int[] arr) {
        int[] prefixProductArr = new int[arr.length + 2];
        prefixProductArr[0]=1;
        int[] suffixProductArr = new int[arr.length+2];
        suffixProductArr[suffixProductArr.length -1] =1;
        int mod = (int) 1e9 + 7;
        int product=1;
        for(int i=1;i<=arr.length;i++){
            prefixProductArr[i] = (prefixProductArr[i-1] *  arr[i-1]) % mod;
        }
        for(int i=arr.length;i>0;i--){
            suffixProductArr[i] = (suffixProductArr[i+1] *  arr[i-1]) % mod;
        }

        for (int i=1;i <= arr.length;i++){
            arr[i-1] = (suffixProductArr[i+1] * prefixProductArr[i-1]) % mod;
        }

        return arr;
    }

}
