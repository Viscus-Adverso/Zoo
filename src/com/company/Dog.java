package com.company;

/**
 * Created by Viscus on 9/20/16.
 */
public class Dog  extends Animal{
    Dog () {
        this.name = "Dog";
    }

    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}
