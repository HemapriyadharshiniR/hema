import java.io.*;
import java.util.*;
class Sumpalindrome
{
 public static void main(String args[])
 {
int i,n=0;
String b="";
  Scanner s=new Scanner(System.in);
  String a=s.next();
  for(i=0;i<a.length();i++)
  {
    n=n+Character.getNumericValue(a.charAt(i));
  }
  b=String.valueOf(n);
  StringBuffer c=new StringBuffer(b);
  c.reverse();
  String d=new String(c);
  if(b.equals(d))
     System.out.println("palindrome");
  else
    System.out.println("not palindrome");
 }
}
