package Prime;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(isThere(new int[]{1, 2, 3, 4},11));

    }
    static boolean isThere(int[] nums ,int traget){

        for (int num : nums) {
            if (num == traget) return true;

        }
        return  false;

    }
}


