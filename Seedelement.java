import java.io.*;
import java.util.*;
class Seedelement
{
 public static void main(String args[])
 {
  int i;
  Scanner s=new Scanner(System.in);
  String a=s.next();
  String b=s.next();
  int c=Integer.parseInt(a);
  int n=c;
  System.out.println(n);
  for(i=0;i<a.length();i++)
  {
   n=n*Character.getNumericValue(a.charAt(i));
   System.out.println(n);
  }
  String h=String.valueOf(n);
  if(h.equals(b))
    System.out.println("seed");
  else
   System.out.println(" no seed");
 }
}
