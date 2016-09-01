import java.io.*;
import java.util.*;
class Pangramchecker
{
 public static void main(String args[])
 {
  int i,j,count=0;
   String c="";
  Scanner s=new Scanner(System.in);
  char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  String b=s.nextLine();
  String d[]=b.split(" ");
  for(i=0;i<d.length;i++)
     c=c.concat(d[i]);
 if(c.length()>=26)
 {
  for(i=0;i<26;i++)
  {
    char r=a[i];
    for(j=0;j<c.length();j++)
    {
     if(r==c.charAt(j))
     {
      count=count+1;
      break;
     }
    }
  }
  if(count==26)
   System.out.println("full string");
  else
    System.out.println("not full string");
 }  
 else
  System.out.println("not full string");
 }
}
