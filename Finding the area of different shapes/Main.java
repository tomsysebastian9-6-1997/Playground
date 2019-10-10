import java.util.Scanner;
import java.lang.Math.*;
class Main
{
  public static void main(String args[])
  {
    int a,b,c,out;
    Scanner sc=new Scanner(System.in); 
    a=sc.nextInt();
  // c=sc.nextInt();
    switch(a)
    {
      case 1:
        b=sc.nextInt();
         out = b*b;
        System.out.println(out);
        break;
      case 2:
        b=sc.nextInt();
        c=sc.nextInt();
         out=b*c;
        System.out.println(out);
        break;
      case 3:
        b=sc.nextInt();
        c=sc.nextInt();
        float ou=(b*c)/2;
        System.out.println(ou);
        break;
      case 4:
        b=sc.nextInt();
        double pi=3.1399999999999999;
        double outp=pi*(b*b);
        System.out.println(outp);
        break;
    }
  }
}