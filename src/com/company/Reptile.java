package com.company;

/**
 * Created by Viscus on 9/20/16.
 */
public class Reptile extends Animal {
    Reptile() {
        this.name = "Reptile";
    }


    void makeSound() {
        super.makeSound();
        System.out.println("Reptile sound!");
    }
}
