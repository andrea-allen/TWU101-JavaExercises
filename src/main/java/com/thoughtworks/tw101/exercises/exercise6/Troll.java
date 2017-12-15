package com.thoughtworks.tw101.exercises.exercise6;

public class Troll extends Monster {

    //Constructor
    public Troll(){
        this.name="Troll";
        this.hitpoints=40;

    }

    @Override
    public void takeDamage(int amount) {
        setHitpoints(getHitpoints()-.5*amount);
    }
}
