package code401challenges.utilities;

import code401challenges.stacksandqueues.Node;
import code401challenges.stacksandqueues.Queue;

public class AnimalShelter<T extends Queue> {
    public Queue dog;
    public Queue cat;

    public AnimalShelter() {
        this.dog = new Queue();
        this.cat = new Queue();
    }

    public void enqueue(Node animal) {
        if(animal.equals(dog)) {
            this.dog.enqueue(animal);
        }
        else {
            animal.equals(cat);
            this.cat.enqueue(animal);
        }
    }

    public Node dequeue(Queue pref) {
        Node animal;
        if (pref.equals(dog)) {
            animal = this.dog.dequeue();
            return animal;
        } else if (pref.equals(cat)) {
            animal = this.cat.dequeue();
        } else {
            return null;
        }
        return animal;
    }

}
