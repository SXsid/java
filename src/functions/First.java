package functions;

import java.util.Scanner;

public  class First {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         System.out.println(isArmStrong(n));
     }

     static  boolean is_odd(int numb){
         return numb%2==0;
     }

     static  void swapTwonum(int a ,int b){
         a=a+b;
         b=a-b;
         a=a-b;
         func(a);
         func();


     }
    //if argumets are diff then it will treat them diff (so function overloading )
     static  void func (int a){

     }
     static  void  func(){

     }

     static  boolean isPrime(int a ){
         if (a<2 )return  false;

         int i =2;
         while(i*i<=a){
             if(a%i==0)return  false;
             i++;
         }


         return  true;
     }

    static  boolean isArmStrong(int n ){
        int sum=0;int temp=n;
        int numOfDigits = (int) Math.log10(n) +1;

        while (n!=0){
            int digit = n%10;
            sum +=Math.pow(digit,numOfDigits);
            n=n/10;
        }
        return  sum==temp;


    }
}