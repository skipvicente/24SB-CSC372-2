import java.util.Scanner;

public class abstract_Class_Shape_1 {
    public static void main(String[] args) {
        Scanner scnr01 = new Scanner(System.in);
        Shape[] myShapeArray = new Shape[3];
        double userNum01;
        double userNum02;

        /* Sphere */
        System.out.println("Enter Sphere radius:");
        userNum01 = scnr01.nextDouble();
        myShapeArray[0] = new Sphere(userNum01);

        /* Cylinder */
        System.out.println("Enter Cylinder radius:");
        userNum01 = scnr01.nextDouble();
        System.out.println("Enter Cylinder height:");
        userNum02 = scnr01.nextDouble();
        myShapeArray[1] = new Cylinder(userNum01, userNum02);

        /* Cone */
        System.out.println("Enter Cone radius:");
        userNum01 = scnr01.nextDouble();
        System.out.println("Enter Cone height:");
        userNum02 = scnr01.nextDouble();
        myShapeArray[2] = new Cone(userNum01, userNum02);

        for (int i = 0; i < 3; i++)
            System.out.println(myShapeArray[i]);

        scnr01.close();
    }
}