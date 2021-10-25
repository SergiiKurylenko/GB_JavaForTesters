package Lesson1;

public class Team {
    private String name;
    private Participant participant[] = new Participant[3];

    public Team(String name) {
        this.name = name;
        this.participant[0] = new Participant("Вася",8);
        this.participant[1] = new Participant("Петя",9);
        this.participant[2] = new Participant("Коля",7);
    }

    public void showResults() {
        System.out.println("Команда " + name + " закончила соревнование с таким результатом:");
        System.out.println("Участник " + participant[0].getName() + " нбрал " + participant[0].getResult() + " очков");
        System.out.println("Участник " + participant[1].getName() + " нбрал " + participant[1].getResult() + " очков");
        System.out.println("Участник " + participant[2].getName() + " нбрал " + participant[2].getResult() + " очков");
    }

    public Participant[] getParticipant() {
        return participant;
    }
}
