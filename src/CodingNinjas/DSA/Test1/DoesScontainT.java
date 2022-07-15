package codingNinjas.DSA.Test1;

import java.util.Scanner;

public class DoesScontainT {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String large = s.nextLine();
        String small = s.nextLine();

        System.out.println(checkSequence(large, small));
    }

    public static boolean checkSequence(String a, String b) {
        if(b.isEmpty()){
           return true;
        }else if(a.isEmpty()){
            return false;
        }


        if(a.charAt(0) == b.charAt(0)){
            return checkSequence(a.substring(1), b.substring(1));
        }else{
            return checkSequence(a.substring(1), b);
        }
    }
}
