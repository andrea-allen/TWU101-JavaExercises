package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class Game {

    public boolean hasWon;

    public double randomNumber;

    //Constructor
    public Game(){
        this.hasWon=false;
        this.randomNumber=Math.round((Math.random())*100); //number formatting
    }

    public void play() {
        System.out.println("playing game");
        while (this.hasWon == false) {
            Scanner sc = new Scanner(System.in); //number formatting, parseInt, and add an error if a user types text
            int i = sc.nextInt();

            Guess guess = new Guess(i);

            guess.check(randomNumber);

            this.hasWon=guess.isRight;
        }
    }


}
