package Lesson3;


import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        Apple apl1 = new Apple(0.1);
        Apple apl2 = new Apple(0.2);
        Apple apl3 = new Apple(0.3);
        Apple apl4 = new Apple(0.15);
        Apple apl5 = new Apple(0.15);
        Apple apl6 = new Apple(0.15);
        Orange orn1 = new Orange(0.4);
        Orange orn2 = new Orange(0.25);
        Orange orn3 = new Orange(0.3);
        Orange orn4 = new Orange(0.15);

        Box<Apple> box1 = new Box<>(Arrays.asList(apl1,apl2,apl3,apl4,apl5));
        Box<Apple> box3 = new Box<>();
        box1.addFruits(apl6);
        Box<Orange> box2 = new Box<>(Arrays.asList(orn1,orn2,orn3,orn4));

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());

        System.out.println(box1.compare(box2));
        box3.removeFromAnotherBox(box1);
        System.out.println(box3.getWeight());
        System.out.println(box1.getWeight());
    }



    private static double getBoxWeight(Box<? extends Fruit> box) {
        double weight = 0;
        for (int i = 0; i < box.getFruits().size(); i++) {
            weight += box.getFruits().get(i).getWeight();
        }
        return weight;
    }





}
