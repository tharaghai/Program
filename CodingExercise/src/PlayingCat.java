public class PlayingCat
{
    public static void main(String[] args)
    {
        System.out.println(isCatPlaying(true,55));
    }
    public static boolean isCatPlaying(boolean summer,int temp)
    {
        if(temp >= 25 && temp <= 35)
        {
            return true;
        }
        else if (summer == true && (temp >= 25 && temp <= 45))
            {
                return true;

            }
        else
            {
         return false;
            }


    }
}
