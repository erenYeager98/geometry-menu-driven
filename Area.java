import java.util.*;

public class Area {
    public static void calculateArea(int shape, Scanner sc) {
        switch (shape) {
            case 1: // Square
                System.out.print("Enter side: ");
                double s = sc.nextDouble();
                System.out.println("Area: " + (s * s));
                break;
            case 2: // Rectangle
                System.out.print("Enter length and width: ");
                double l = sc.nextDouble(), w = sc.nextDouble();
                System.out.println("Area: " + (l * w));
                break;
            case 3: // Triangle
                System.out.print("Enter base and height: ");
                double b = sc.nextDouble(), h = sc.nextDouble();
                System.out.println("Area: " + (0.5 * b * h));
                break;
            case 4: // Circle
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area: " + (Math.PI * r * r));
                break;
            default:
                System.out.println("Invalid shape!");
        }

    }

}