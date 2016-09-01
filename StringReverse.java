import java.io.*;
import java.util.*;
class StringReverse
{
 public static void main(String args[])
 {
int i;
  Scanner s=new Scanner(System.in);
  String a=s.next();
  char b[]=a.toCharArray();
  Set<Character> c=new HashSet<Character>();
  for(i=0;i<b.length;i++)
  {
    c.add(b[i]);
  }
System.out.println(c);
 }
}
