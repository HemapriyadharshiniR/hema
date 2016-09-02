import java.io.*;
import java.util.*;
class Powerofdigits3
{
 public static void main(String args[])
 {
  int i,e=1,c=0,j;
  Scanner s=new Scanner(System.in);
  String a=s.next();
   int b=Character.getNumericValue(a.charAt(a.length()-1));
   for(i=0;i<a.length();i++)
   {
    int d=Character.getNumericValue(a.charAt(i));
      System.out.println(d);
       System.out.println(b);
       for(j=0;j<b;j++)
        {
          e=e*d;
        }
     c=c+e;
    e=1;
   }
  System.out.println(c);
 }
}
