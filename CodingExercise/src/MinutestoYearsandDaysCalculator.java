public class MinutestoYearsandDaysCalculator
{
    public static void main(String[] args)
    {
        printYearsAndDays(1051200L);
    }
    public static void printYearsAndDays(long minutes)
    {
        long days = minutes/1440;
        long years= days / 365;
        long res= days - (365*years);
        if(minutes < 0)
        {
            System.out.println("invalid value");
        }
        else
        {
            System.out.println(minutes + " min" + " = "+ years + " yy and " + res + " d" );
        }
    }
}
