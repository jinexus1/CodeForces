package CodeForces;
import java.util.Scanner;
public class IQTest {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n+1];
    int even=0,odd=0;//counter to store number of odd or even
    int evenIndex=0,oddIndex=0;//to store the latest even or odd index
    for (int i = 1; i <=n; i++) {
      arr[i]=sc.nextInt();
      if(arr[i]%2==0){
        evenIndex=i;
        even++;
      }
      else{
        oddIndex=i;
        odd++;
      }
    }if(odd>even){//odd numbers are more
      System.out.println(evenIndex);
    }
    else{//even numbers are more
      System.out.println(oddIndex);
    }

  }
}
