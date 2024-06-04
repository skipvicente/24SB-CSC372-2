public class abstract_Class_Shape_1 {
    public static void main(String[] args) {
        Shape[] myShapeArray = new Shape[3];

        myShapeArray[0] = new Sphere(4.5);
        myShapeArray[1] = new Cylinder(3.5, 6.5);
        myShapeArray[2] = new Cone(5.0, 7.5);

        for (int i = 0; i < 3; i++)
            System.out.println(myShapeArray[i]);
    }
}