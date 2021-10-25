package Lesson1;

public class Participant {
    private String name;
    private int skill;
    private int result;

    public Participant(String name, int skill) {
        this.name = name;
        this.skill = skill;
        this.result = 0;
    }

    public void setResult(int result) {
        this.result += result;
    }

    public int getSkill() {
        return skill;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }
}
