package lesson3.labs.Prob3.B;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 3);
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.computeVolume());
    }
}
