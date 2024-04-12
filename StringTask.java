package CodeForces;

import java.util.Scanner;

public class StringTask {
  public static void main(String[] args) {
    String s;
    Scanner sc=new Scanner(System.in);
    s=sc.next();
    s=s.toLowerCase();
    String ans="";
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='a'||s.charAt(i)=='u'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'|| s
          .charAt(i) == 'y')
        continue;
      else{
        ans+="."+s.charAt(i);
      }
    }
    System.out.println(ans);
  }
}
