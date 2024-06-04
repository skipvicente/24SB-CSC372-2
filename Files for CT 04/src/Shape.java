public abstract class Shape {
    public abstract double surface_area();
    public abstract double volume();
}

class Sphere extends Shape {

    private double radius;
    public Sphere (double radius){
        this.radius = radius;
    }

    public String toString()
    {
        System.out.println("Test surface area: " + surface_area());
        System.out.println("Test volume: " + volume());
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

