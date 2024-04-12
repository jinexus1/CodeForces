package CodeForces;
import java.util.*;
public class evenOdds {
  public static void main(String[] args) {
    long n;
    Scanner sc=new Scanner (System.in);
    n=sc.nextLong();
    long k=sc.nextLong();
    long ans;
    if(k<=(n+1)/2){
      ans=k*2-1;
    }
    else{
      ans=(k-(n+1)/2)*2;
    }
    System.out.println(ans);
  }
}
