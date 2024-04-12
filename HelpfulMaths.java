package CodeForces;

import java.util.Scanner;

public class HelpfulMaths {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char[]ch=new char[s.length()];
    ch= s.toCharArray();
    int arr[]=new int[s.length()];
    for(int i=0;i<s.length();i++){
      if(ch[i]=='+')
      continue;
      arr[i]=(int) ch[i];
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
