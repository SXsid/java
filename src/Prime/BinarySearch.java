package Prime;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(isThere(new int[]{0,1,2,3,4} ,-1
        ));
    }
    static boolean isThere(int[] nums ,int target){
        int lowIndex =0;
        int highIndex = nums.length;
        while (lowIndex<highIndex){
            int midPoint = lowIndex + (int)Math.floor((highIndex - lowIndex) / 2.0);
            int value = nums[midPoint];
            if(value==target) return  true;
            else if (value>target) highIndex=midPoint;
            else lowIndex=midPoint+1;
        }
        return false
                ;
    }
}
