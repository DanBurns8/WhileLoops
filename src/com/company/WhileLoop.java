package com.company;

import com.sun.security.jgss.GSSUtil;

public class WhileLoop {

    public static int addOdds(int n){
        int count=1;
        int sum=0;
        while(n>=count){
            sum+=count;
            count+=2;
        }
        return sum;
    }

    public static int sumDigits(int n){
        int sum=0;
        int a=0;
        while(n>0) {
           a=n%10;
           n=n/10;
           sum+=a;
        }
        return sum;
    }

    public static int howManyYears(double startpop, double endpop){
        int year=0;
        while(startpop<=endpop){
            startpop*=1.0113;

            year++;
        }
        return year;
    }

    public static void printSum(int n){
        int sum=0;
        int a=1;
        while(a<=n){
            System.out.print(a+ " + ");
            sum+=a;
            a++;
        }
        System.out.println("=" + sum);
    }

    public static boolean isPerfectSquare(int n){
        int sum=0;
        int a=1;
        while(sum<n){
            sum+=a;
            a+=2;
        }
        if(sum==n){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Add Odds");
        System.out.println(addOdds(34));
        System.out.println(addOdds(8));
        System.out.println(addOdds(12));
        System.out.println(" ");
        System.out.println("Sum Digits");
        System.out.println(sumDigits(145));
        System.out.println(sumDigits(6377));
        System.out.println(sumDigits(456));
        System.out.println(" ");
        System.out.println("How Many Years");
        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));
        System.out.println(" ");
        System.out.println("Print Sum");
        printSum(21);
        printSum(9);
        printSum(11);
        System.out.println(" ");
        System.out.println("Perfect Square");
        System.out.println(isPerfectSquare(49));
        System.out.println(isPerfectSquare(54));
        System.out.println(isPerfectSquare(121));
        System.out.println(isPerfectSquare(13));
    }
}
