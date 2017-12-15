package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    private int average;

    //Constructor
    public RectangleAverager(){
        average=0;
    }

    //averageArea method
    public float averageArea(Rectangle[] rectangles) {
        int sum=0;
        int total=0;
        for(Rectangle rectangle:rectangles){
            sum+=rectangle.area();
            total++;
        }
        setAverage(sum/total);

        return getAverage();
    }

    //Setter
    public void setAverage(int average) {
        this.average = average;
    }

    //Getter
    public int getAverage() {
        return this.average;
    }
}
