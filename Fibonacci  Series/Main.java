import java.util.*;
class Fibonacci extends Thread
{
  // type your code here
}
class Main
{
     public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       System.out.println("Enter the limit for Fibonacci: "+a);
        if(a>0)
        {
       int x=0;
       int y=1;
        System.out.print("The Fibonacci series is :"+x+" "+y);  
      for(int i=1;i<a-1;i++)
       {
         int z=x+y;
         x=y;
         y=z;
         System.out.print(" "+z);
       }
        } 
       else
         System.out.print("Exception occurred");
     }
}