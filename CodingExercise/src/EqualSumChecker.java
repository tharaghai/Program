public class EqualSumChecker
{
    public static void main(String[] args)
    {
        System.out.println(hasEqualSum(1,1,4));
    }
    public static boolean hasEqualSum(int a,int b,int c)
    {
        int d = a+b;
        if(c == d)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
