package domain;

public class Raccoon extends Predator {

    private String habitat;

    public Raccoon(String name, int weight, String habitat) {
        super(name, weight);
        this.habitat = habitat;
    }

    public Raccoon() {
        this("Rocky",6,"forest");
    }

    public Raccoon(String name) {
        this(name,6,"forest");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting for insects");
    }

    @Override
    public String toString() {
        return super.toString()+"\nHabitat:\t"+this.habitat+"\n\nThis is raccoon!";
    }

    public void makeSound() {
        System.out.println(getName() + " is making sounds");
    }

    public void climb() {
        System.out.println(getName() + " is climbing a tree");
    }
    
    
}
