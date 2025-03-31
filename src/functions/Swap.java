package functions;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr ={1,2}
                ;
        System.out.println(Arrays.toString(arr));
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));

    }
    //swap without creating an extra varaible
    static  void  swap(int[] arr,int index1,int index2){
        arr[index1]=arr[index1]+arr[index2];
        arr[index2]=arr[index1]-arr[index2];
        arr[index1]=arr[index1]-arr[index2];
    }
}
