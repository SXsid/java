package Sorting;

import functions.Array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={38,1,2,3,7,5,7};
        for (int i = 0; i <arr.length -1 ; i++) {
            //find min index  from shifting i to no of claulates
            int minIndex= i;
            for (int j = i; j <arr.length ; j++) {
                if(arr[j]<arr[minIndex])minIndex=j;


            }
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;


        }

        System.out.println(Arrays.toString(arr));
        descSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void descSelectionSort(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            int maxIndex =i;
            for (int j = i; j <arr.length ; j++) {
                if(arr[maxIndex]<arr[j]) maxIndex=j;

            }

            int tem= arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=tem;

        }
    }



}
