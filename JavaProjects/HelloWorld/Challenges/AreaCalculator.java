package HelloWorld.Challenges;

public class AreaCalculator {
    public static void main(String[] args) {
        double areaSquare = area(10);
        double areaRectangle = area(10, 30);
        System.out.println("area of square is = " + areaSquare + " and area of rectangle = " + areaRectangle);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double area = radius * radius * Math.PI;
        return area;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1.0;
        }
        double area = x * y;
        return area;
    }

}
