package Prime;

import java.util.NavigableSet;

public class TwoCrystalProblem {
    public static void main(String[] args) {
        System.out.println(solution(new boolean[] {true,true,true,true,true,true}));

    }
    //regural binary serach
    static  int findFirstbreakPoint(boolean[] breakPoint){
        int lowIndex = 0;
        int highIndex = breakPoint.length;
        while(lowIndex<highIndex){
            int midPoint = lowIndex+ (highIndex-lowIndex)/2;
            boolean midValue = breakPoint[midPoint];

            if(midValue){
                if(!breakPoint[midPoint-1]){
                    return  midPoint;

                }
                highIndex= midPoint;
            }
            else{
                lowIndex = midPoint+1;
            }

        }
        return  -1;
    }
    //what if after finding the ball will break (we have to use second ball lineratly so make as less step from the first ball
    // means sqrt(n) steps n is the length of the array)

    static  int solution(boolean[] breaPoint){
        NavigableSet<Double> Maths;
        int n = breaPoint.length;
        int hopNumber = (int) Math.floor(Math.sqrt(n));
        int i = hopNumber;
        for (; i <n; i+=hopNumber) {
            if(breaPoint[i]){
                break;
            }

        }
        int start= i -hopNumber;
       int end = Math.min(n,i);
        for (int j = start; j <end ; j++) {
                if(breaPoint[j]){
                    return  j;
                }

        }
        return  -1;


    }
}
