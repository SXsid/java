package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int[] arr={64,1,3,4,19,84};
    ascBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        descBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void ascBubbleSort(int[] arr){
        //step 1) iterat ove aray 2) adjajacent compare if greater swap and
        for (int j = 0; j <arr.length-1 ; j++) {
            boolean swap=false;
            for (int i = 0; i <arr.length-j-1; i++) {
                if(arr[i]>arr[i+1]){
                    int tem= arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tem;
                    swap=true;
                }

            }

            if(!swap) break;
        }
    }

    static  void descBubbleSort(int[] arr){

        for (int i = 0; i <arr.length-1 ; i++) {
            //optimize
            boolean swap=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int tem= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                    swap=true;
                }

            }
            if(!swap) break;
        }
    }
}
