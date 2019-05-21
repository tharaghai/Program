public class BarkingDog
{
    public static void main(String[] args)
    {
        System.out.println(shouldwakeUp(true,23));
    }
    public static boolean shouldwakeUp(boolean barking,int hourofDay)
    {
        if(barking)
        {
            if (hourofDay < 0 || hourofDay > 23)
            {
                return false;
            }
            if (hourofDay < 8 || hourofDay > 22)
            {
                return true;
            }
            else
                {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
