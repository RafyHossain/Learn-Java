package S3_ParamiterisedMethod;

public class Test {
    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher();
        Teacher1.setInfo(25,"Rafy Hossain","Male");
        Teacher1.displayInformation();
        System.out.println();

        Teacher Teacher2 = new Teacher();
        Teacher2.setInfo(22,"Rafy Hossain Sohag","Male");
        Teacher2.displayInformation();

    }

}
