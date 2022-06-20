import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select figure type: Circle (c), Triangle (t), Rectangle (r):");
        String figure = scanner.next();
        switch (figure) {
            case "c" -> Figures.circleArea();
            case "t" -> Figures.triangleArea();
            case "r" -> Figures.rectangleArea();
            default -> System.out.println("Incorrect figure type was selected");
        }
    }
}
