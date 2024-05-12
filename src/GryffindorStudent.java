public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int courage;

    public GryffindorStudent(int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public void printTheStudent() {
        System.out.println("magicPower: " + getMagicPower() + "; transgressionDistance: " + getTransgressionDistance() +
                "; nobility: " + nobility +
                "; honor: " + honor +
                "; courage: " + courage);
    }

}
