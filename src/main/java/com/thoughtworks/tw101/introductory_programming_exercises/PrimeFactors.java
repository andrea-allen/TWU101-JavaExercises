package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        ArrayList<Integer> primeFactors = generate(7476);

        System.out.print(primeFactors);
    }

    private static ArrayList<Integer> generate(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean foundDivisor=false;
        if(n==0){
            return null;
        }
        if(n<0){
            return generate(Math.abs(n));
        }
        if(n==1){
            return list;
        }
        if (isPrime(n)==true){
            list.add(n);
            return list;
        }

        else{
            int i=2;
            while (foundDivisor==false){
                if(n%i==0){
                    ArrayList<Integer> divisorFactors = generate(i);
                    list.addAll(divisorFactors);
                    ArrayList<Integer> quotientFactors = generate(n/i);
                    list.addAll(quotientFactors);
                    foundDivisor=true;
                }
                else{
                    i++;
                }
            }

        }

        return list;
    }

    private static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){ return false; }
        }
        return true;
    }


}
