package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the name and current hit
// points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

abstract public class Monster {

    protected double hitpoints;

    protected String name;

    abstract public void takeDamage(int amount);

    public void reportStatus(){
        System.out.println(getName());
        System.out.println(getHitpoints());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getHitpoints(){
        return this.hitpoints;
    }

    public void setHitpoints(double hitpoints){
        this.hitpoints=hitpoints;
    }
}
