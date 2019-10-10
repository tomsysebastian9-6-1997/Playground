import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    //c = mathPow(a,b);
    System.out.println(maPow(a,b));
  }
  public static int maPow(int i,int j)
  {
   int res=1;
    while(j>=1)
    {
      res = res*i;
      j--;
      
    }
    return res;
  }
}