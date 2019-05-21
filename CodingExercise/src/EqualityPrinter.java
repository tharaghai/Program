public class EqualityPrinter
{
    public static void main(String[] args)
    {
       printEqual(1,1,4);
    }
    public static void printEqual(int a,int b,int c)
    {
        if((a < 0) && (b < 0) && (c < 0))
        {
            System.out.println("invalid value");
        }
        else if((a == b) && (a == c) && (b == c))
        {
            System.out.println("All Numbers are Equal");
        }
        else if((a != b) && (a != c) && (b != c))
        {
            System.out.println("All Numbers are Different");
        }
        else
        {
            System.out.println("Neither All are Equal or Different");
        }
    }
}
