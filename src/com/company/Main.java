package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        Hawk h = new Hawk();
        Snake s= new Snake();


        d.makeSound();
        h.makeSound();
        s.makeSound();



        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an animal name");
        String name = scanner.nextLine();
        Animal a = createAnimal(name);
        System.out.println(a);

        //anonymous classes

        Mammal d2 = new Mammal() {
            @Override
            void makeSound() {
                System.out.println("Bark!");
            }
        };

        Bird h2 =new Bird() {
            @Override
            void makeSound() {
                System.out.println("Caww!");
            }
        };

        Reptile s2 = new Reptile() {
            @Override
            void makeSound() {
                System.out.println("Hissssssssssssssss!");
            }
        };

    }



    //factory method
    static Animal createAnimal(String name) {
        Animal animal;
        if (name.equalsIgnoreCase("dog")) {
            animal = new Dog();
        }
        else if (name.equalsIgnoreCase("hawk")) {
            animal = new Hawk();
        }
        else if (name.equalsIgnoreCase("snake")) {
            animal = new Snake();
        }
        else{
            animal = new Animal();
        }
        return animal;
    }
}
