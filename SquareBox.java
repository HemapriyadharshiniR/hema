import java.io.*;
import java.util.*;
class SquareBox
{
 public static void main(String args[])
 {
  int i;
  Scanner s=new Scanner(System.in);
  int a[]=new int[8];
   for(i=0;i<8;i++)
      a[i]=s.nextInt();
  int b=a[6]-a[0];
  int c=a[3]-a[1];
  int d=a[4]-a[2];
  int e=a[5]-a[7];
  if(b==c && b==d &&b==e && c==d &&c==e && d==e)
    System.out.println("SQUARE");
  else
    System.out.println(" NOT SQUARE");
 }
}
