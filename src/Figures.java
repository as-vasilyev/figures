import java.util.Scanner;

public class Figures {
    public static void circleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        int r = scanner.nextInt();
        if (r > 0) {
            double area = Math.PI * Math.pow(r,2);
            System.out.printf("Circle area is %f \n", area);
        } else {
            System.out.println("The Circle with entered radius doesn't exist");
        }
    }

    public static void rectangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side");
        int a = scanner.nextInt();
        System.out.println("Enter second side");
        int b = scanner.nextInt();

        if (a > 0 && b > 0 ) {
            int area = a * b;
            System.out.printf("Rectangle area is %d \n", area);
        } else {
            System.out.println("The rectangle with entered sides doesn't exist");
        }
    }

    public static void triangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side");
        int a = scanner.nextInt();
        System.out.println("Enter second side");
        int b = scanner.nextInt();
        System.out.println("Enter third side");
        int c = scanner.nextInt();

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            int s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Triangle area is %f \n", area);
        } else {
            System.out.println("The triangle with entered sides doesn't exist");
        }
    }

}
