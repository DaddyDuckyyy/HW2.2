public abstract class HogwartsStudent {
    private int magicPower;
    private int transgressionDistance;

    public HogwartsStudent(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }
    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}
