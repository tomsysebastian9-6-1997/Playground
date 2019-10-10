//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int a)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+a);
  }
}
class CSE
{
  public void salary(int a)
  {
    //write your CSE class statements
    a=a+3000;
    System.out.println("CSE Faculty: "+a);
  }
}
class IT
{
  public void salary(int a)
  {
    //write your IT class statements
    a=a+5000;
    System.out.println("IT Faculty: "+a);
  }
}
class ECE
{
  public void salary(int a)
  {
    //write your ECE class statements
    a = a+4500;
    System.out.println("ECE Faculty: "+a);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   //implement your required concept here
    Faculty fa = new Faculty();
    fa.salary(a);
    CSE cs = new CSE();
    cs.salary(a);
    IT i = new IT();
    i.salary(a);
    ECE obj = new ECE();
    obj.salary(a);
  }
}