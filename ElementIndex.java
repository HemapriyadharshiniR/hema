import java.io.*;

import java.util.*;

class ElementIndex

{
 
 public static void main(String args[])
  
{
  
 int i;
 Scanner s=new Scanner(System.in);
   
int n=s.nextInt();
    
int a[]=new int[n];

   for(i=0;i<n;i++)

      a[i]=s.nextInt();

   Arrays.sort(a);

    for(i=0;i<n;i++)
      System.out.println(a[i]);
    for(i=0;i<n;i++)

    {

     //System.out.println(a[i]);
     if(i==a[i])

     {

       System.out.println(i);

     }

    }

  }

}
