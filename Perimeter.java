import java.util.Scanner;

public class Perimeter {
    public void Calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circlePerimeter = 2 * Math.PI * radius;
                System.out.println("Perimeter of the circle: " + circlePerimeter);
                break;

            case 2:
                System.out.print("Enter the three sides of the triangle: ");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                double trianglePerimeter = side1 + side2 + side3;
                System.out.println("Perimeter of the triangle: " + trianglePerimeter);
                break;

            case 3:
                System.out.print("Enter the length and width of the rectangle: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double rectanglePerimeter = 2 * (length + width);
                System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}