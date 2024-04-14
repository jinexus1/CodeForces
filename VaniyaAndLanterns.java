import java.util.Arrays;
import java.util.Scanner;

public class VaniyaAndLanterns {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();//number of lanterns
    int l=sc.nextInt();
    int [] lanterns_pos=new int[n];
    for (int i = 0; i < lanterns_pos.length; i++) {
      lanterns_pos[i]=sc.nextInt();
    }
    Arrays.sort(lanterns_pos);
    int diff=Math.max(lanterns_pos[0],l-lanterns_pos[n-1]);
    for (int i = 1; i < lanterns_pos.length; i++) {
      diff=Math.max(diff,lanterns_pos[i]-lanterns_pos[i-1]);
    }
    System.out.println((double)diff/2.0);
  }
}
