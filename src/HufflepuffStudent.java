public class HufflepuffStudent extends HogwartsStudent implements Qualities{
    private int diligence;
    private int honesty;
    private int loyalty;

    public HufflepuffStudent(int magicPower, int transgressionDistance, int diligence, int honesty, int loyalty) {
        super(magicPower, transgressionDistance);
        this.diligence = diligence;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    public void showTheQualities() {
        System.out.println("magicPower: " + getMagicPower() +
                "; transgressionDistance: " + getTransgressionDistance() +
                "; diligence: " + diligence +
                "; honesty: " + honesty +
                "; loyalty: " + loyalty);
    }

    public int propertySum() {
        return diligence + honesty + loyalty;
    }
}
