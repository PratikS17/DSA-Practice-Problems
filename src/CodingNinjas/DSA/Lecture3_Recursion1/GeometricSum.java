package codingNinjas.DSA.Lecture3_Recursion1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GeometricSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        double ans = findGeometricSum(k);
        DecimalFormat dec = new DecimalFormat("#0.00000");
        System.out.println(dec.format(ans));
    }

    public static double findGeometricSum(int k){
        if(k==0){
            return 1;
        }
        int product =1;
        for (int i = 1; i <=k ; i++) {
            product *= 2;
        }
        double ans = (1.0/product) + findGeometricSum(k-1);
        return ans;
    }
}
