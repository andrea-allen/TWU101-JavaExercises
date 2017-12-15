package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public boolean hasWon;

    public double randomNumber;

    public ArrayList<Integer> guesses;

    //Constructor
    public Game(){
        this.hasWon=false;
        this.randomNumber=Math.round((Math.random())*100); //number formatting
        this.guesses=new ArrayList<Integer>();
    }

    public void play() {
        while (this.hasWon == false) {
            Scanner sc = new Scanner(System.in); //number formatting, parseInt, and add an error if a user types text
            int i = sc.nextInt(); //make sure to parseInt

            //INCOMPLETE: handle EXCEPTION for user String input

            Guess guess = new Guess(i);

            guesses.add(i);

            guess.check(randomNumber);

            this.hasWon=guess.isRight;
        }

        System.out.print(guesses);
    }


}