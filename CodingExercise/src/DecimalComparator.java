public class DecimalComparator
{
    public static void main(String[] args)
    {
        System.out.println(areEqualByThreeDecimalPlaces(3.1457,3.1459));
    }
    public static boolean areEqualByThreeDecimalPlaces(double a,double b)
    {
     double x = a* 1000;
     double y = b *1000;
     if((int)x == (int)y)
     {
         return true;
     }
     else
     {
         return false;
     }

    }
}
