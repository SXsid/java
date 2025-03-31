package functions;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] name ={"aman","sid","sudhanshu"};
        int[] num= {1,2,3,4} ;

        int [][] num2d = {{1,2,3},{4,5,6}};
        for (int[] value:num2d){
            System.out.println(Arrays.toString(value));
        }
    }
}
;