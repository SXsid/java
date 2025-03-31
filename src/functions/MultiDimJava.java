package functions;

import java.util.ArrayList;

public class MultiDimJava {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> multArrayList = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            multArrayList.add(i,new ArrayList<>());
            
        }
        System.out.println(multArrayList);
        for(ArrayList value:multArrayList){
            System.out.println(value);
        }
    }
}
