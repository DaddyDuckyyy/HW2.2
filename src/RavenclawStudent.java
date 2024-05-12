public class RavenclawStudent extends HogwartsStudent{
    private int cleverness;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public RavenclawStudent(int magicPower, int transgressionDistance, int cleverness, int wisdom, int wittiness, int creativity) {
        super(magicPower, transgressionDistance);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }
}
