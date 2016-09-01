import java.io.*;
import java.util.*;
class DeleteString
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  String a=s.next();
  char b[]=a.toCharArray();
  Arrays.sort(b);
  String c=new String(b);
  StringBuffer d=new StringBuffer(c);
  d.delete(d.length()-3,d.length());
  System.out.println(d);
 }
}
