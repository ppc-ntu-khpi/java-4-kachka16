package domain;

public class Animal {

    private String name;
    public int weight;

    public Animal() {
        name="generic animal";
        weight=10;
    }
    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public void eat() {
        System.out.println(name + " is eating food");
    }

    public void makeSound() {
        System.out.println(name + " is making sounds");
    }
     public void move() {
        System.out.println(name + " is moving");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    @Override
    public String toString() {
        return "THE ANIMAL" + "\nName:\t" + name + "\nWeight:\t" + weight+" kg";
    }

 
}
