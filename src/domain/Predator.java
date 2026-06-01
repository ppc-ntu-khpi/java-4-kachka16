package domain;

public class Predator extends Animal {
    public Predator() {
        super();
    }
    public Predator(String name, int weight) {
        super(name, weight);
    }

    public void hunt() {
        System.out.println(getName() + " is hunting");
    }
}
