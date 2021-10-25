package Lesson1;

import java.util.Random;

public class Barrier {
    private static int barrierNumber;
    private int barrierStrong;
    private String name;

    public Barrier() {
        barrierNumber ++;
        this.name = "Барьер номер " + barrierNumber;
        this.barrierStrong = new Random().nextInt(10);
    }

    public int getBarrierStrong() {
        return barrierStrong;
    }

    public String getName() {
        return name;
    }
}
