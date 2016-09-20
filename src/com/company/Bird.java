package com.company;

/**
 * Created by Viscus on 9/20/16.
 */
public class Bird extends Animal {
    Bird () {
        this.name = "Bird";
    }


    void makeSound() {
        super.makeSound();
        System.out.println("Bird sound!");
    }
}
