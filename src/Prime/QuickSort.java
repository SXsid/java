package Prime;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] myArray= {
                5, 3, 2, 34, 1, 3,-1
        };

        //first clall
        QuickSort(myArray,0,myArray.length-1);
        System.out.println(Arrays.toString(myArray));

    }


    static  void QuickSort(int[] arr ,int low ,int high){

        System.out.printf("quicksort( %d ,%d)",low,high);
        if (low>=high){
            return;
        }
        int pivotIndex=partition(arr,low,high );
        QuickSort(arr,low,pivotIndex-1);
        QuickSort(arr,pivotIndex+1,high);


    }


    static  void Swap(int[] arr ,int index1 ,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }

    //partion hte arry into 2 part to perform the soritng in less steps
    static  int partition(int [] arr ,int low ,int high){
        int mid =low + (high-low)/2;
        int pivot= arr[mid];
        Swap(arr,high,mid);
        int statingPoint=low;
        for (int i = low; i < high ; i++) {

            if (arr[i]<pivot){
                Swap(arr,i,statingPoint);
                statingPoint++;
            }
        }
        Swap(arr,statingPoint,high);

        // retrun the index
        return statingPoint ;

    }

}
