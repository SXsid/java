package functions;

public class Fabonachi {
    public static void main(String[] args) {
        int n =7;
        System.out.println(fabonachi(n));
    }

    static  int fabonachi (int n ){
        if(n==0) return  0;
        int firstNum=0; //f(0)
        int secondNum=1;//f(1)
        for (int i = 2; i <= n; i++) {

            int temp = firstNum+secondNum;
            firstNum=secondNum;
            secondNum=temp;
        }
        return  secondNum;

    }
//not recommend out of stack could occur
    static  int fabnachi(int n ,int secondNum , int firstNum){
        if(n==0) return  firstNum;
        if(n==1) return  secondNum;

        return  fabnachi(n-1,firstNum+secondNum,secondNum);

    }
}
