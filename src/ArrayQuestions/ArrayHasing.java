package ArrayQuestions;

import java.util.Scanner;

public class ArrayHasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //nubmer of array
        int n =in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextInt();
        }
        int[] hash= new int[13]; //max element is 12

        for(int value:arr){
            hash[value]++;
        }
        int count =in.nextInt();
        while(count!=0){
            if(count>hash.length) System.out.println("out of scope");
            else{
                int Hashcount = hash[count];
                System.out.println(Hashcount);
            }
            count =in.nextInt();
        }

    }

}
