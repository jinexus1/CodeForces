package CodeForces;
import java.util.*;
public class Expressions {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a,b,c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    // All the permutation and combination of operations for a,b,c
    int e1=a*b*c;
    int e2= a+b+c;
    int e3=(a*b)+c;
    int e4= (a + b) * c;
    int e5= a +( b * c);
    int e6=a*(b+c);
    //storing them in array
    int arr[]={e1,e2,e3,e4,e5,e6};
    //using in-built sort functuion in java
    Arrays.sort(arr);
    //Accessing the max element
    System.out.println(arr[arr.length-1]);

  }
}
