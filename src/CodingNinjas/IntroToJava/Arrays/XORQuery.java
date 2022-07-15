package codingNinjas.IntroToJava.Arrays;

import java.util.ArrayList;

public class XORQuery {
    public static void main(String[] args) {

        ArrayList<Integer> q1 = new ArrayList<>();
        q1.add(1);
        q1.add(4);
        ArrayList<Integer> q2 = new ArrayList<>();
        q2.add(1);
        q2.add(5);
        ArrayList<Integer> q3 = new ArrayList<>();
        q3.add(2);
        q3.add(1);
        ArrayList<ArrayList<Integer>> queries= new ArrayList<>();
        queries.add(q1);
        queries.add(q2);
        queries.add(q3);

        System.out.println(xorQuery(queries));
    }

    public static ArrayList<Integer> xorQuery(ArrayList<ArrayList<Integer>> queries) {
        ArrayList<Integer> finalAns = new ArrayList<>();
        for(int i=0 ; i< queries.size() ; i++){

            ArrayList<Integer> query = queries.get(i);
            if(query.get(0) == 1){
                finalAns.add(query.get(1));
            }else{
                for(int j=0;j < finalAns.size() ;j++){
                    finalAns.set(j , (finalAns.get(j) ^ query.get(1)));
                }
            }
        }
        return finalAns;
    }
}
