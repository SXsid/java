package Prime;

import java.awt.desktop.PreferencesEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr ={
                5,4,3,2,1
        };
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static  void mergeSort(int[] nums ,int low ,int high){

        if(low>=high) return;

        int mid = low + (high-low)/2;

        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);

        //after reaching singlrui start mergin

        List<Integer> result = new ArrayList<>();
        int firstArrayIndex = low;
        int secondArrayIndex = mid+1;

        while (firstArrayIndex<=mid && secondArrayIndex<=high){
            if(nums[firstArrayIndex]<=nums[secondArrayIndex]){
                result.add(nums[firstArrayIndex++]);

            }else{
                result.add(nums[secondArrayIndex++]);

            }
        }


        //append the resule on
        while(firstArrayIndex<=mid){
            result.add(nums[firstArrayIndex++]);
        }
        while(secondArrayIndex<=high){
            result.add(nums[secondArrayIndex++]);
        }

        //using original array we have created soret array for the certain index

        for (int i = 0; i <result.size() ; i++) {
            nums[low+i]= result.get(i);
        }




    }

}
