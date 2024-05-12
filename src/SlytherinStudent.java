public class SlytherinStudent extends HogwartsStudent implements Qualities{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudent(int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void showTheQualities() {
        System.out.println("magicPower: " + getMagicPower() +
                "; transgressionDistance: " + getTransgressionDistance() +
                "; cunning: " + cunning +
                "; determination: " + determination +
                "; ambition: " + ambition +
                "; resourcefulness: " + resourcefulness +
                "; lustForPower: " + lustForPower);
    }

    public int propertySum() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
}
