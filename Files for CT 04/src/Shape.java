public abstract class Shape {
    public abstract double surface_area();
    public abstract double volume();
}

class Sphere extends Shape { /* We are working with the sphere shape object here */

    private double radius;
    public Sphere (double radius){

        this.radius = radius;
    }

    public String toString()
    {
        //System.out.println("Test surface area: " + surface_area());
        //System.out.println("Test volume: " + volume());
        return "The spheres surface area is: " + surface_area() + " The spheres volume is: " + volume();
    }

    public double surface_area() /* Here we calculate the surface area */
    {
        return 4.0 * Math.PI * radius * radius;
    }

    public double volume() /* Here we calculate the volume */
    {
        return 4.0 * Math.PI * radius * radius * radius / 3.0;
    }
}


class Cylinder extends Shape { /* We are working with the cylinder shape object here */
    private double radius, height;

    public Cylinder (double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public String toString() {
        return "This is the surface are aof the cylinder: " + surface_area() + "This is the volume of the cylinder: " + volume();
    }

    public double surface_area(){

        return 2.0 * Math.PI * radius * (radius + height);
    }

    public double volume() {

        return Math.PI * radius * radius * height;
    }
}

class Cone extends Shape { /* We are working with the cone shape object here */
    private double radius, height;

    public  Cone (double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public String toString(){
        return "This is the surface area of the cone: " + surface_area() + " This is the volume of the cone: " + volume();
    }

    public  double surface_area(){
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    public double volume(){
        return Math.PI * radius * radius * height / 3.0;
    }
}
