import java.util.Scanner;

public class XeniaAndRingroad {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int initial=1;
    long time=0;
    for (int i = 0; i < m; i++) {
      int present=sc.nextInt();
      if(present>=initial)
      time+=present-initial;//when initial postion is after inital pos
      else
      time+=n-(initial-present);//when initial postion is before inital pos
      initial=present;//updating the current position
    }
    System.out.println(time);
  }
}
