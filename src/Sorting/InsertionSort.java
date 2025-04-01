package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={1,3,2,1,3,11,7};

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0; j--) {

                        ;
                if(arr[j]<arr[j-1]){
                    //if it get swaped automaticlay the j-- index will be the index of the thing we want to insert
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }else{
                    break;
                }


            }

        }
        System.out.println(Arrays.toString(arr));
       insertionSortDESC(arr);
        System.out.println(Arrays.toString(arr));
    }

    //adjacent swap with optimization
    static  void bubblesort(int[] arr){

        for (int i = 0; i < arr.length-1 ; i++) {
            boolean swap=false;
            for (int j = 0; j <arr.length-1-i ; j++) {

                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }

            }
            if(!swap) break;

        }

    }

    static  void insertionSortDESC(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0; j--) {

                if(arr[j]>arr[j-1]){
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;


                }else{
                    break;
                }

            }

        }
    }

}
