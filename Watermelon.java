import java.util.*;
import java.lang.*;
import java.io.*;

public class Watermelon{
  public static void main (String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    if(t%2==0)
    {
      if((t/2.0)%2==0)
      System.out.println("YES");
      else
      System.out.println("NO");
    }
    else
    System.out.println("NO");
  }
}