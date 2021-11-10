package com.company;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.multbyTwo(64));
        System.out.println(m.multbyTwo(8));
    }
    public int multbyTwo(int n){
        int count = 0;
        int i = 0;
        int product = 1;
        while(product<=n){
            product *= 2;
            count++;
        }
        return count;
    }
}
