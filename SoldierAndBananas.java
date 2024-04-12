package CodeForces;
import java.util.Scanner;
public class SoldierAndBananas {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int k,n,w;
    k=sc.nextInt();
    n = sc.nextInt();
    w = sc.nextInt();
    int sum=0;
    for (int i=1;i<=w;i++){
      sum=sum+i*k;
    }
    if(sum-n<=0)
     System.out.println("0");
    else{
      System.out.println(sum - n);
    }
  }
}
