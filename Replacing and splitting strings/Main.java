import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
      //Try your code here
      //String str1,str2,str3,res;
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
       String str=(str1.replace(str1, str2));
      //System.out.println(str);
      String[] res = str.split("\\s");
      
      //String[] arr=res;
      
      for(String value : res)
      {
        System.out.println(value);
      }
    }
}