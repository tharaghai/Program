public class MegaByteConverter
{
    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        int mb = kiloBytes / 1024 ;
        int mb1 = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB"+" = "+ mb + " MB and " +mb1+ " KB");
        if(kiloBytes < 0)
        {
            System.out.println("invalid value");
        }
    }

}
