import java.io.*;
import java.util.*;
class Powerofdigits1
{
 public static void main(String args[])
 {
  int i,e=1,c=0,j;
  Scanner s=new Scanner(System.in);
  String a=s.next();
  
   for(i=0;i<a.length()-1;i++)
   {
    int d=Character.getNumericValue(a.charAt(i));
      System.out.println(d);
        int b=Character.getNumericValue(a.charAt(i+1));
       System.out.println(b);
       for(j=0;j<b;j++)
        {
          e=e*d;
        }
     c=c+e;
    e=1;
   }
    int b=Character.getNumericValue(a.charAt(a.length()-1));
    c=c+b;
  System.out.println(c);
 }
}
