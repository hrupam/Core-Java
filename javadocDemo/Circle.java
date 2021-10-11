/**
 * @author Rupam Hari
 * @version 1.0
 * @since 2018
 */
package javadocDemo;

/**
 * @author Rupam Hari
 * Class for Circle
 */
public class Circle implements Comparable<Circle> {
    /**
     * @value value of radius
     */
    private int radius;

    /**
     * Parameterized constructor
     *
     * @param radius Set the radius during instantiating
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * Getter
     *
     * @return returns radius of the circle
     * @throws Exception if radius = 0
     */
    public int getRadius() throws Exception {
        if (this.radius != 0) return this.radius;
        else throw new Exception("Radius cannot be zero");
    }

    /**
     * Setter
     *
     * @param radius sets radius of circle
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * @return returns area of circle
     */
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * @return returns circumference of circle
     */
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle o) {
        return (int) Math.round(this.area() - o.area());
    }

    /**
     * @return String representation of Circle
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
