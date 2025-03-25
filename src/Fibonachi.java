import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int firstnum =0;
        int secondNum =1;
        int result =0;
        for (int i = 0; i <n-2 ; i++) {
            result = firstnum+secondNum;
            firstnum=secondNum;
            secondNum=result;
        }
        System.out.println(result);
    }
}
