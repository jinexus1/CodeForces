package CodeForces;

import java.util.Scanner;

public class ChatRoom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String hello = "hello";
    int j = 0, pass = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == hello.charAt(j)) {
        j++;
        pass++;
        if (j == hello.length()) // Add condition to break loop when all characters of "hello" are matched
          break;
      }
    }
    if (pass == hello.length()) { // Compare with the length of "hello"
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
