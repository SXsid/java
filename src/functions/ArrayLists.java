package functions;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList <String> arrylist= new ArrayList<>(2);
        arrylist.add("aman");
        arrylist.add(1,"aman");

        System.out.println(arrylist.get(1));

    }
}
