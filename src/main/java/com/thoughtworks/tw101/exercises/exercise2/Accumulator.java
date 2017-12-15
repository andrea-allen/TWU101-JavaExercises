package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int total;

    //Constructor
    public Accumulator(){
        total=0;
    }

    //increment method
    public void increment() {
        setTotal();
    }

    //total method
    public void total() {
        System.out.print(getTotal());
    }

    //Getter
    public Integer getTotal() {
        return this.total;
    }

    //Setter
    public void setTotal() {
        this.total=getTotal()+1;
    }
}
