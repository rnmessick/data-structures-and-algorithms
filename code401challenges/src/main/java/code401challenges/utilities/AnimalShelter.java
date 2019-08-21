package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;

public class AnimalShelter<T extends Queue<T>> {
    public Queue<T> dog;
    public Queue<T> cat;

    public AnimalShelter() {
        this.dog = new Queue<>();
        this.cat = new Queue<>();
    }

    public void enqueue(T animal) {
        if(animal.equals(dog)) {
            this.dog.enqueue(animal);
        }
        else {
            animal.equals(cat);
            this.cat.enqueue(animal);
        }
    }

    public Queue<T> dequeue(Queue pref) {
        T animal;
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
