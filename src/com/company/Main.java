package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Main obj = new Main();
        int c = obj.decrement(10);
        System.out.println(c);
    }

    public int decrement(int a){

        a--;
        if(a == 0)
            return a;
        else
        return decrement(a);
    }
}
