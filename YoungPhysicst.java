package CodeForces;

import java.util.Scanner;

public class YoungPhysicst {
  public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int sum=0;
    int f=0;
    int a[][]=new int[n][3];
    for(int i=0;i<n;i++){
       for(int j=0;j<3;j++){
        a[i][j]=sc.nextInt();
       }
    }
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        sum=sum+a[i][j];
      }
      if(sum==0){
        f=1;
      }
      else{
        f=0;
        break;
      }
    }
    if(f==1){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
}
