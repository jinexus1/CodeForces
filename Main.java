// package CodeForces;

// import java.util.Scanner;

// public class taxi {
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int a=0,b=0,c=0,d=0;
//     while(n!=0){
//       int x=sc.nextInt();
//       switch (x) {
//         case 1:
//           a++;          
//           break;
//         case 2:
//           b++;
//           break;
//         case 3:
//           c++;
//           break;
//         case 4:
//           d++;
//           break;
//         default:
//           break;
//       }
//       n--;
//     }
//       int taxi=0;
//       taxi+=d;
//       taxi+=c;
//       a=a-c;
//       if(a<0) a=0;
//       if(b%2==0){
//         b=b/2;
//         taxi+=b;
//       }
//       else{
//         b=b/2+1;
//         taxi+=b;
//         a=a-b;
//         if(a<=0)a=0;
//       }
//       ;
//       taxi+=(int)Math.ceil(a/4.0);
      
//     System.out.println(taxi);
//   }
// }
package CodeForces

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] data = new int[5];
    int cnt = 0;

    int n = Integer.parseInt(br.readLine());
    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str, " ");
    while (st.hasMoreTokens())
      data[Integer.parseInt(st.nextToken())]++;

    cnt = data[4] + data[3] + data[2] / 2;
    data[1] -= data[3];

    if (data[2] % 2 == 1) {
      cnt++;
      data[1] -= 2;
    }

    if (data[1] > 0)
      cnt += (data[1] + 3) / 4;

    System.out.println(cnt);
  }
}