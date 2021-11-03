package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Box <E extends Fruit> {
    private ArrayList<E> fruits = new ArrayList<>();

    public Box(List<E> fruits) {
        this.fruits.addAll(fruits);
    }

    public Box() {

    }

    public ArrayList<E> getFruits() {
        return fruits;
    }

    public void addFruits(E e) {
            this.fruits.add(e);
    }

    public double getWeight(){
        if (fruits.isEmpty()) return 0;
        if (fruits.get(0) instanceof Apple) return fruits.size() * 1.0f;
        return fruits.size() * 1.5f;
    }

    public boolean compare(Box box){
        return this.getWeight() == box.getWeight() ? true : false;
    }

    public void removeFromAnotherBox(Box<E> box){
        this.fruits.addAll(box.getFruits());
        box.clear();
    }

    private void clear() {
        this.fruits.clear();
    }


}
