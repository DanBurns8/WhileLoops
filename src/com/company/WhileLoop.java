package com.company;

public class WhileLoop {

    public int addOdds(int n){
        int count=1;
        int sum=0;
        while(n>=count){
            sum+=count;
            count+=2;
        }
        return sum;
    }

    public int sumDigits(int n){
        int sum=0;
        while(n>=1) {
           n/10;
           n%10;
           sum;
        }
        return sum;
    }


    public static void main(String[] args) {
        WhileLoop w = new WhileLoop();
        System.out.println(w.addOdds(34));
        System.out.println(w.addOdds(8));
        System.out.println(w.addOdds(12));
        System.out.println(" ");
        System.out.println(w.sumDigits());
    }
}
