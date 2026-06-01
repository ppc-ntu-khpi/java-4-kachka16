Для прикладу я взяла єнота для виконання практичної роботи🦝

![task1](https://github.com/ppc-ntu-khpi/java-4-kachka16/blob/master/images/raccoon.jpg?raw=true)
![task2](https://github.com/ppc-ntu-khpi/java-4-kachka16/blob/master/images/Main.jpg?raw=true)
# Звіт о виконання роботи

## Завдання 1

> З допомогою StarUML створіть діаграму класів для обраної тварини. Згенеруйте каркасний код на основі діаграми. Допрацюйте код - всі методи мають виводити на екран повідомлення про те, що робить тварина! Створіть тестовий клас, в методі main якого створіть об'єкт класу тварини та викличіть його методи

### Animal.java
``` java
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

```

### Raccoon.java
``` java
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
```

### Predator.java
``` java
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
```

### TestAnimal.java
``` java
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

```

## Результат

![task3](https://github.com/ppc-ntu-khpi/java-4-kachka16/blob/master/images/result.png?raw=true)
