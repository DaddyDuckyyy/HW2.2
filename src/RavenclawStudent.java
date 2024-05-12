public class RavenclawStudent extends HogwartsStudent implements Qualities{
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

    public void showTheQualities() {
        System.out.println("magicPower: " + getMagicPower() +
                "; transgressionDistance: " + getTransgressionDistance() +
                "; cleverness: " + cleverness +
                "; wisdom: " + wisdom +
                "; wittiness: " + wittiness +
                "; creativity: " + creativity);
    }

    public int propertySum() {
        return cleverness + wisdom + wittiness + creativity;
    }
}
