

public class Point  {


    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    void printPoint() {
        System.out.print("("+x+";"+y+")");
    }
    public double calcLength (Point a, Point b) {


    return (Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2)));

    }



}
