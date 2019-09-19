import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int sum = (a%10)+(a/10);
      System.out.println(sum);
	}
}