package CodeForces;
import java.util.Scanner;
public class NearlyLuckyNumber {
  public static void main(String[] args) {
    long n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextLong();
    int count=0;
     while (n != 0)
    {
        if (n % 10 == 4 || n % 10 == 7)
        {
            count += 1;
        }
        n /= 10;
    }
    if (count == 4 || count == 7)
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }
    
  }
}
