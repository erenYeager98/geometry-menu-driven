import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Choose an option: ");
        System.out.println("1. Area");
        System.out.println("2. Volume");
        System.out.println("3. Perimeter");
        
        num = in.nextInt();
        
        switch(num) {
            case 1:
                Area areaObj = new Area();  
                areaObj.Calculate();        
                break;

            case 2:
                Volume volumeObj = new Volume();  
                volumeObj.Calculate();            
                break;
                
            case 3:
                Perimeter perimeterObj = new Perimeter();  
                perimeterObj.Calculate();
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}