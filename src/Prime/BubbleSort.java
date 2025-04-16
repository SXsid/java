package Prime;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray={10,12,3,4,5,1,2,-1};
        sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));

    }

    static  void  sort(int[] unsortedArray){
        for (int i = 0; i <unsortedArray.length-1 ; i++) {
            for (int j = 0; j <unsortedArray.length-1-i ; j++) {
                if(unsortedArray[j]>unsortedArray[j+1]){
                    int temp = unsortedArray[j];
                    unsortedArray[j]=unsortedArray[j+1];
                    unsortedArray[j+1]=temp;
                }

            }

        }

    }
}
