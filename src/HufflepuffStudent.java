public class HufflepuffStudent extends HogwartsStudent {
    private int diligence;
    private int honesty;
    private int loyalty;

    public HufflepuffStudent(int magicPower, int transgressionDistance, int diligence, int honesty, int loyalty) {
        super(magicPower, transgressionDistance);
        this.diligence = diligence;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    public void printTheStudent() {
        System.out.println("magicPower: " + getMagicPower() +
                "; transgressionDistance: " + getTransgressionDistance() +
                "; diligence: " + diligence +
                "; honesty: " + honesty +
                "; loyalty: " + loyalty);
    }
}
