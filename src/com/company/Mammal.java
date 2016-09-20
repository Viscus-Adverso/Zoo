package com.company;

/**
 * Created by Viscus on 9/20/16.
 */
public class Mammal extends Animal {
    Mammal() {
        this.name = "Mammal";
    }


    void makeSound() {
        super.makeSound();
        System.out.println("Mammal sound!");
    }
}

