import java.util.Scanner;

public class Area {
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
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + circleArea);
                break;

            case 2:
                System.out.print("Enter the base and height of the triangle: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of the triangle: " + triangleArea);
                break;

            case 3:
                System.out.print("Enter the length and width of the rectangle: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Area of the rectangle: " + rectangleArea);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}