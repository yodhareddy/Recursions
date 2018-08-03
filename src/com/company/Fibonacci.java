package com.company;

public class Fibonacci {

    public static int index = 0;
    public static int end = 10;


    public int fib(int a,int b){

        if(a == 0)
            System.out.println("0\n1");


        index++;
        if (index+2 == end){
            return a+b;
        }
        else {
            System.out.println(a + b);
            return fib(b, a + b);
        }
    }
    public static void main(String args[]){
        Fibonacci f = new Fibonacci();
        int result = f.fib(0,1);
        System.out.println(result);
    }
}
