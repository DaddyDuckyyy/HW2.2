public class Main {
    public static void main(String[] args) {
        GryffindorStudent harryPotter = new GryffindorStudent(34, 29, 97, 56, 23);
        GryffindorStudent hermioneGranger = new GryffindorStudent(49, 56, 23, 21, 80);
        GryffindorStudent ronWeasley = new GryffindorStudent(34, 67, 54, 49, 28);

        SlytherinStudent dracoMalfoy = new SlytherinStudent(78, 45, 82, 46, 12, 67, 93);
        SlytherinStudent grahamMontague = new SlytherinStudent(32, 45, 23, 86, 45, 45, 23);
        SlytherinStudent gregoryGoyle = new SlytherinStudent(8, 56, 12, 45, 2, 46, 34);

        HufflepuffStudent zachariahSmith = new HufflepuffStudent(75, 27, 98, 64, 32);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent(64, 19, 25, 47, 23);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent(56, 12, 65, 89, 24);

        RavenclawStudent zhouChang = new RavenclawStudent(64, 83, 32, 67, 64, 23);
        RavenclawStudent padmaPatil = new RavenclawStudent(34, 1, 13, 68, 32, 87);
        RavenclawStudent marcusBelby = new RavenclawStudent(34, 23, 10, 45, 56, 12);

        hermioneGranger.printTheStudent();
        gregoryGoyle.printTheStudent();
        padmaPatil.printTheStudent();

    }
}
