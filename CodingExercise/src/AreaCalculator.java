public class AreaCalculator
{
    public static void main(String[] args)
    {
        System.out.println(area(1.35));
        System.out.println(area(1.5,2.2));
    }
    public static double area(double radius)
    {
        double circle = radius*radius*Math.PI;
        if(circle<0)
        {
            return -1.0;
        }
        return circle;
    }
    public static double area(double x,double y)
    {
        double rect = x*y;
        if(rect < 0)
        {
            return -1.0;
        }
        return rect;
    }
}
