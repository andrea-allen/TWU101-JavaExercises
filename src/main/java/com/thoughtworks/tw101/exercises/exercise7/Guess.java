package com.thoughtworks.tw101.exercises.exercise7;

public class Guess {
    //object that is a new guess that the user specifies

    double guess;

    boolean isRight;

    //Constructors
    public Guess(){
        this.guess=0;
        this.isRight=false;
    }

    public Guess(double guess){
        this.guess=guess;
        this.isRight=false;
        }


    public void check(double randomNumber){
        if (randomNumber==this.guess){
            System.out.println("Correct! You win.");
            this.isRight=true;
        }
        if (randomNumber<this.guess){
            System.out.println("Too High! Guess again.");
        }
        if (randomNumber>this.guess){
            System.out.println("Too Low! Guess again.");
        }
    }


}
