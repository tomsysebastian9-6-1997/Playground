import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
  public static void main(String a[]){
      // type your code here
    String s1,s2,s3;
    Scanner sc=new Scanner(System.in);
    //  System.out.println("Is "+s1+" a valid user name? true");
    s1=sc.nextLine();
    s2=sc.nextLine();
    s3=sc.nextLine();
    Pattern p1=Pattern.compile("^[A-Za-z0-9_-]*$");
    Matcher m1=p1.matcher(s1);
    if(m1.matches())
    {
      System.out.println("Is "+s1+" a valid user name? true");
    }
    else
    {
      System.out.println("Is "+s1+" a valid user name? false");
    }
    Pattern p2=Pattern.compile("^[a-z0-9_@.]*$");
    Matcher m2=p2.matcher(s2);
    if(m2.matches())
    {
      System.out.println("Is "+s2+" a valid email address? true");
    }
    else
    {
      System.out.println("Is "+s2+" a valid email address? false");
    }
    Pattern p3=Pattern.compile("^[A-za-z@#$%0-9]*$");
    Matcher m3=p3.matcher(s3);
    if(m3.matches())
    {
      System.out.println("Is "+s3+" a valid password? true");
    }
    else
    {
      System.out.println("Is "+s3+" a valid password? false");
    }
  }
}