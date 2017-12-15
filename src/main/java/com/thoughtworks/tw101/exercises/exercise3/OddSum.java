package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
    private Integer sum;

    //Constructor
    public OddSum(){
        System.out.println("Constructor Running");
        sum=0;
    }

    //Setter
    public void setSum(Integer sum){
        this.sum=sum;
    }

    //Getter
    public Integer getSum(){
        return this.sum;
    }

    //of method
    public int of(int start, int end) {
        int i=start;
        while(i<end+1){
            if (i%2>0) {
                setSum(getSum() + i);
            }
            i++;
        }
        return getSum();
    }
}
