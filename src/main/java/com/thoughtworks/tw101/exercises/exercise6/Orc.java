package com.thoughtworks.tw101.exercises.exercise6;

public class Orc extends Monster {

    //Constructor
    public Orc(){
        this.name="Orc";
        this.hitpoints=20;

    }

    @Override
    public void takeDamage(int amount) {
        setHitpoints(getHitpoints()-amount);
    }

}
