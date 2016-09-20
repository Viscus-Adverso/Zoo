package com.company;

/**
 * Created by Viscus on 9/20/16.
 */
public class Snake extends Reptile {
    Snake () {
        this.name = "snake";
    }

    @Override
    void makeSound() {
        System.out.println("HSS!");
    }
}
