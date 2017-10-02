

public class Circle {
    public  Point center;
    //public  Point b;
    //public  double rb;
    public  double radius;


    public Circle (Point a, double ra){
        this.center =  a;
     //   this.b = b;
        this.radius = ra;
     //   this.rb = rb;

    }

    public boolean collisionCheck (Circle c, Circle d) {
        boolean check;
        if (center.calcLength(c.center, d.center) - c.radius - d.radius > 0)
            check = true;
        else check = false;
        return check;
    }




}
