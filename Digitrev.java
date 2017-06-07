import java.io.*;
import java.util.Scanner;
class Digitrev
{   
    public static void main(String arg[])
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
     int rev;
    while (n != 0)
    {
        rev=(n%10);
        n=n/10;
     System.out.println(rev);
    }
    
}
}
