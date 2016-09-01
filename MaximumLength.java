import java.io.*;
import java.util.*;
class MaximumLength
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter no");
int n=s.nextInt();
System.out.println("enter inputs");
String a[]=new String[n];
int i,j;
for(i=0;i<n;i++)
{
a[i]=s.nextLine();
}
for(i=0;i<a.length;i++)
{
String s1=a[i];
int limit=Integer.parseInt(a[i+1]);
for(j=0;j<limit;j++)
{
System.out.println(a[i]);
}
}

}
}
