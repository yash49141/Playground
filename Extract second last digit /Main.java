import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner (System.in);
      int a = in.nextInt();
      int sec_last_digit = (a % 100) / 10;
      System.out.println(sec_last_digit);
	}
}