class MyModel1 {
     //write your logic here
  String s1,s2;
  public MyModel1()
  {
  
  s1="Features of MyModel 1";
  s2="Camera mega pixels: 2";
  }
}
class MyModel2 extends MyModel1 {
     //write your logic here
  String s6,s3,s4,s5;
  public MyModel2()
  {
   s6="Features of MyModel 2";
    s3="Camera mega pixels: 5";
    s4="Lock mechanism: Fingerprint";
    s5="Display size: 5";
  }
}
class MyModel2T extends MyModel2 {
     //write your logic here
  String s7,s8,s9,s10;
  public MyModel2T()
  {
    s7="Features of MyModel 2T";
    s8="Camera mega pixels: 16";
    s9="Lock mechanism: Fingerprint";
    s10="Display size: 6";
  }
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
    MyModel1 m1=new MyModel1();
      System.out.println(m1.s1+"\n"+m1.s2);
      MyModel2 m2=new MyModel2();
      System.out.println(m2.s6+"\n"+m2.s3+"\n"+m2.s4+"\n"+m2.s5);
      MyModel2T m3=new MyModel2T();
      System.out.println(m3.s7+"\n"+m3.s8+"\n"+m3.s9+"\n"+m3.s10);
    }
}