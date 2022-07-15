package codingNinjas.IntroToJava.Arrays;

import java.util.ArrayList;

public class CountAllSubArraysHavingSumDivisibleByK {
    public static void main(String[] args) {
        int[] arr ={ 5, 0, 2, 3, 1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,1);
        arrayList.add(1,4);
        arrayList.add(2,5);
        arrayList.add(3,2);
        //arrayList.add(4,1);
        int k=3;
        System.out.println(subArrayCount(arrayList,k));
    }

    public static int subArrayCount(ArrayList< Integer > arr, int k) {
//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        hashMap.put(0,1);
//        int sum = 0;
//        int rem = 0;
//        int ans=0;
//        int mod = (int) 1e9 + 7;
//        for (int i=0 ; i< arr.size();i++){
//            sum = (sum + arr.get(i)) % mod;
//            rem = sum % k;
//            if(rem < 0)
//                rem += k;
//            if(hashMap.containsKey(rem)){
//                ans += hashMap.get(rem);
//                hashMap.put(rem, hashMap.get(rem) + 1);
//            }
//            else{
//                hashMap.put(rem,1);
//            }
//        }
//        return ans;

        int countMap[] = new int[k];
        countMap[0]=1;
        int sum = 0,count = 0;
        for(int value:arr){
            sum = (sum+value)%k;

            if(sum<0){
                sum = sum+k;
            }
            count+=countMap[sum];
            countMap[sum]++;
        }

        return count;
    }

}
