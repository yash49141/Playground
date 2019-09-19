import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner (System.in);
      int n1 = in.nextInt();
      int first = n1%10;
      int sec = n1/100;
      int add = first+sec;
      System.out.println(add);
	}
}