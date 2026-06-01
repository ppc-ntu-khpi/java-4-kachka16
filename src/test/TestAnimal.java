package test;

import domain.Raccoon;

public class TestAnimal {

    public static void main(String[] args) {
        System.out.println("===>Testing the created UML diagram<===");
        Raccoon raccoon = new Raccoon("Rocky", 6, "forest");
        raccoon.move(); 
        raccoon.makeSound();  
        raccoon.hunt();  
        raccoon.eat(); 
        raccoon.climb(); 
        System.out.println("-----------------------------------------");
        System.out.println(raccoon);
    }
}
