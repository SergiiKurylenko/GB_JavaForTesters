package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
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

    public boolean addFruits(Fruit fruit) {
        if (fruit.getClass().equals(this.fruits.get(0).getClass())) {
            this.fruits.add((E) fruit);
            return true;
        }
        return false;
    }

    public double getWeight(){
        if (fruits.get(0) instanceof Apple) return fruits.size() * 1.0f;
        return fruits.size() * 1.5f;
    }

    public boolean compare(Box box){
        return this.getWeight() == box.getWeight() ? true : false;
    }


}
