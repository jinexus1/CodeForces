import java.util.*;
import java.lang.*;
import java.io.*;

public class Watermelon{
  public static void main (String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    String t=sc.next();
    if(t.length()>10)
    {
      int length=t.length();
      System.out.println(t.charAt(0)+length-2+t.charAt(length-1));
    }
    else
    System.out.println(t);
  }
}