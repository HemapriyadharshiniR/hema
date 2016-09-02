import java.io.*;

import java.util.*;

class Uniquearray

{

  public static void main(String args[])

  {

    int c,i,j;
    Scanner s=new Scanner(System.in);

    int n=s.nextInt();

    int a[]=new int[n];

    for(i=0;i<n;i++)

      a[i]=s.nextInt();

    for(i=0;i<n;i++)

    {
 c=0;
      if(a[i]!='\0')

      {

       int b=a[i];

      for(j=0;j<n;j++)

      {

        if(b==a[j])

        {

          c++;

          a[j]='\0';

        }

      }

      System.out.println(b+""+c);
      if(c==1)

      {

      System.out.println(b);

      }

      }

    }

  }

}
