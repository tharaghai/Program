public class SpeedConverter
{
    public static void main(String[] args)
    {
        System.out.println(toMilesPerHour(10.25));
        printConversion(3.15);
    }
    public static long toMilesPerHour(double kilometersPerHour)
    {
        double miles = kilometersPerHour / 1.609 ;
        long res = Math.round(miles);
        if (kilometersPerHour < 0)
        {
            return -1;
        }
        if (kilometersPerHour > 0)
        {
            return res;

        }
        return res;
    }
    public static void printConversion(double kilometersPerHour)
    {
        double miles1 = kilometersPerHour / 1.609;
        System.out.println(kilometersPerHour + " km/h" + " = " + miles1 +" mi/h");
        if(kilometersPerHour < 0)
        {
            System.out.println("invalid value");
        }
    }
}
