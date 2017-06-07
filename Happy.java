import java.util.*;
import java.util.Scanner;
class Happy
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int sq=0,sq1=0;
   while(n>0)
 {
int r=n%10;
sq+=r*r;
while(sq>9)
 {
int r1=sq%10;
sq1+=r1*r1;
sq=sq/10;
}
n=n/10;
}
if(sq==1)
System.out.print("happy number");
else
System.out.print("not a happy number");
}
}


