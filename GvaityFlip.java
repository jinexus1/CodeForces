package CodeForces;

import java.util.Scanner;
import java.util.Arrays;

public class GvaityFlip {
  public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int [] arr=new int [n];
    for(int i =0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    for(int i =0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
