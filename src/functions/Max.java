package functions;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,2,3,44};
        int max = arr[0];
        for(int value:arr){
            if(value>max) max=value;
        }
        System.out.println(max);
    }
}
