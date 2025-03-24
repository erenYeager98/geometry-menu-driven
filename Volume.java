import java.util.Scanner;

public class Volume {
    public void Calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Sphere");
        System.out.println("2. Cube");
        System.out.println("3. Cylinder");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the sphere: ");
                double radius = scanner.nextDouble();
                double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                System.out.println("Volume of the sphere: " + sphereVolume);
                break;

            case 2:
                System.out.print("Enter the side length of the cube: ");
                double side = scanner.nextDouble();
                double cubeVolume = Math.pow(side, 3);
                System.out.println("Volume of the cube: " + cubeVolume);
                break;

            case 3:
                System.out.print("Enter the radius and height of the cylinder: ");
                double cylRadius = scanner.nextDouble();
                double height = scanner.nextDouble();
                double cylinderVolume = Math.PI * Math.pow(cylRadius, 2) * height;
                System.out.println("Volume of the cylinder: " + cylinderVolume);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}