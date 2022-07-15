package codingNinjas.IntroToJava.Lecture8;

public class Problems {
    public static void main(String[] args) {
        int n=10,r=6;
        int factn=1,factr=1,factnr=1;
        for(int i=2;i<=n;i++)
        {
            factn*=i;
            if(i<=r)
                factr*=i;
            if(i<=n-r)
                factnr*=i;
        }
        int ncr=factn/(factr*factnr);
        System.out.print(ncr);
        System.out.print(add(10,3));

        int a=4;
        int b=5;
        System.out.print(sum(a,b));
    }
    public static double add(int a,int b)
    {
        float c=a+b;
        return c;
    }

//    public static int sum(int a,int b)
//    {
//        System.out.print("int sum ");
//        return a+b;
//    }
    public static long sum(long a,long b)
    {
        System.out.print("long sum ");
        return a+b;
    }
}
