package point;

public class Point
{
    private double x;
    private double y;

    public Point(){}

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point secondPoint)
    {
        double ans = Math.sqrt((this.x - secondPoint.x) * (this.x - secondPoint.x) + (this.y - secondPoint.y) * (this.y - secondPoint.y));
        return ans;
    }

    public double distance(Point p1, Point p2)
    {
        double ans = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
        return ans;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
