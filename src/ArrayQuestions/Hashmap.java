package ArrayQuestions;

import functions.Array;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine().trim();
        HashMap<Character,Integer> hashmap =new HashMap<>();
            for(char c:string.toCharArray()){
                hashmap.put(c,hashmap.getOrDefault(c,0)+1);
            }
        System.out.println(hashmap);




    }

}
