import java.io.*;
import java.util.*;
class StringConversion
{
 public static void main(String args[])
 {
  int i;
  String c="";
  Scanner s=new Scanner(System.in);
  String a=s.next();
  for(i=0;i<a.length()-1;i++)
  {
    char b=a.charAt(i);
    int n=(int)b-1;
    if(n>97)
    {
     c=c.concat(String.valueOf((char)n));
    }
    else
    {
     char r='z';
     c=c.concat(String.valueOf(r));

    }
  }
  c=c.concat(String.valueOf(a.charAt(a.length()-1)));
 System.out.println(c);
 }
}