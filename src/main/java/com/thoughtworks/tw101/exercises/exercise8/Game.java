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
        this.randomNumber=Math.round((Math.random())*100);
        this.guesses=new ArrayList<Integer>();
    }

    public void play() throws NumberFormatException{
        while (this.hasWon == false) {
            Scanner sc = new Scanner(System.in);
            try{
                int i = Integer.parseInt(sc.next());

                Guess guess = new Guess(i);

                guesses.add(i);

                guess.check(randomNumber);

                this.hasWon=guess.isRight;


            }
            catch ( NumberFormatException ex) {
                System.out.println("That's not an integer! Try again.");
                continue;
            }


        }

        System.out.print(guesses);
    }


}