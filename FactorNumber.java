import java.util.*;
class FactorNumber
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int fact=n;
for(int i=n-1;i>1;i--)
{
fact=fact*i;
}
System.out.println("factorial of a number is"+fact);
}
}
