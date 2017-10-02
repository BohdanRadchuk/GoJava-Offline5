
import java.util.Scanner;


public class OfllineFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter point a coordinates");
        Point a = new Point(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("enter point b coordinates");
        Point b = new Point(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("enter first circle radius");
        Circle c = new Circle(a, scanner.nextDouble());
        System.out.println("enter secondd circle radius");
        Circle d = new Circle(b, scanner.nextDouble());
        System.out.println(c.collisionCheck(c,d));
        /*                         task 1

        a.printPoint();
        b.printPoint();
        System.out.println();
        System.out.println("Расстояние между точками: "+b.calcLength(a, b));
    */}




}
