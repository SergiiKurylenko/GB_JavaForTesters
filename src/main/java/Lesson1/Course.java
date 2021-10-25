package Lesson1;

public class Course {
    private Barrier barrier[] = new Barrier[10];

    public Course() {
        for (int i = 0; i < 10; i++) {
            this.barrier[i] = new Barrier();
        }
    }

    public void doIt(Lesson1.Team team) {
        for (int i = 0; i < team.getParticipant().length; i++) {
            for (int j = 0; j < barrier.length; j++) {
                if (team.getParticipant()[i].getSkill() >= barrier[j].getBarrierStrong()) {
                    team.getParticipant()[i].setResult(1);
                    System.out.println("Участник " + team.getParticipant()[i].getName() + " преодолел " + barrier[j].getName());
                } else {
                    team.getParticipant()[i].setResult(-1);
                    System.out.println("Участник " + team.getParticipant()[i].getName() + " НЕ преодолел " + barrier[j].getName());
                }
            }
        }
    }
}
