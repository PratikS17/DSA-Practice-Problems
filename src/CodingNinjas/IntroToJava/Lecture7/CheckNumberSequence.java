package codingNinjas.IntroToJava.Lecture7;

import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev=sc.nextInt();
        boolean isSwitchHappened = false;
        boolean ans=true;
        for(int i=1;i<=n-1;i++){
            int cur = sc.nextInt();
            if(cur < prev){
                if(isSwitchHappened){
                    ans=false;
                }
            }else if(cur > prev ){
                isSwitchHappened = true;
            }
            else{
                System.out.println(false);
                return;
            }
            prev= cur;
        }
        System.out.println(ans);
    }
}
