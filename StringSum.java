import java.io.*;
import java.util.*;
class StringSum
{
 public static void main(String args[])
 {
  int n,i,j=0,sum=0;
  Scanner s=new Scanner(System.in);
  String a=s.next();
int l=a.length();
  while(true)
  {
   for(i=0;i<j;i++)
   {
    n=Character.getNumericValue(a.charAt(i));
    sum=sum+n;
   }
    j++;
   if(j>l)
     break;
  }
  System.out.println(sum);
 }
}
