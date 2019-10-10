import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
          // type your code ing 
      String s1,s2;
      Scanner sc=new Scanner(System.in);
      s1=sc.nextLine();
     // s2=sc.nextLine();
      Pattern p=Pattern.compile("(and|or|,|\\s)");
      String s[]=p.split(s1);
      for(String value:s)
      {
        System.out.println(value);
      }
      
    }
}