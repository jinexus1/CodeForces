package CodeForces;
import java.util.Scanner;
public class elephant {
  public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int c=0;
    //Approach-1
    // while(n/5!=0){
    //   c++;
    //   n=n-5;
    // }
    // while (n / 4 != 0) {
    //   c++;
    //   n = n - 4;
    // }
    // while (n / 3 != 0) {
    //   c++;
    //   n = n - 3;
    // }
    // while (n / 2 != 0) {
    //   c++;
    //   n = n - 2;
    // }
    // while (n / 1 != 0) {
    //   c++;
    //   n = n - 1;
    // }
    // System.out.println(c);
    //Approach-2
    int s=n/5;
    if(n%5==0){
      System.out.println(s);
    }
    else{
      System.out.println(s+1);
    }

  }
}
