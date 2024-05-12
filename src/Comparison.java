public abstract class Comparison {
    public static void compareStudents(GryffindorStudent student1, GryffindorStudent student2){
        if (student1.propertySum()>student2.propertySum()){
            System.out.println("Первый ученик лучше");
        }else if ((student1.propertySum()<student2.propertySum())) {
            System.out.println("Второй ученик лучше");
        } else {
            System.out.println("Ученики равны");
        }

    }
    public static void compareStudents(RavenclawStudent student1, RavenclawStudent student2){
        if (student1.propertySum()>student2.propertySum()){
            System.out.println("Первый ученик лучше");
        }else if ((student1.propertySum()<student2.propertySum())) {
            System.out.println("Второй ученик лучше");
        } else {
            System.out.println("Ученики равны");
        }
    }
    public static void compareStudents(SlytherinStudent student1, SlytherinStudent student2){
        if (student1.propertySum()>student2.propertySum()){
            System.out.println("Первый ученик лучше");
        }else if ((student1.propertySum()<student2.propertySum())) {
            System.out.println("Второй ученик лучше");
        } else {
            System.out.println("Ученики равны");
        }
    }
    public static void compareStudents(HufflepuffStudent student1, HufflepuffStudent student2){
        if (student1.propertySum()>student2.propertySum()){
            System.out.println("Первый ученик лучше");
        }else if ((student1.propertySum()<student2.propertySum())) {
            System.out.println("Второй ученик лучше");
        } else {
            System.out.println("Ученики равны");
        }
    }
    public static void compareStudents(HogwartsStudent student1, HogwartsStudent student2){
        if (student1.propertySum()>student2.propertySum()){
            System.out.println("Первый ученик лучше");
        }else if ((student1.propertySum()<student2.propertySum())) {
            System.out.println("Второй ученик лучше");
        } else {
            System.out.println("Ученики равны");
        }
    }
}
