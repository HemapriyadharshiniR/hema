import java.io.*;
import java.util.*;
class DoubleString
{
 public static void main(String args[])
 {
  int i,j;
  Scanner s=new Scanner(System.in);
  String a=s.next();
  for(i=0;i<a.length();i++)
  {
   for(j=i+1;j<a.length();j++)
   {
    if(a.charAt(i)==a.charAt(j))
    {
      String b=a.substring(i,j);
      String c=a.substring(j,a.length());
      if(c.equals(b))
      {
       System.out.println("double string");
       System.exit(0);
      }
      else
      {
         System.out.println("not double string");
       System.exit(0);
      }
    }
   }
  }
 }
}
