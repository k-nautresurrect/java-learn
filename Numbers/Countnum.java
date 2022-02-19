/*
	given a number n -> count number of digit
	n is positive integer
	1 < n < 10^n
	// datastructure
	// complexity
	time limit : 1sec
*/
import java.util.*;
import java.io.*;

public class Countnum {
	public static void main(String[] args) {
		// input initiated
		Scanner in = new Scanner(System.in);
		// data structure
		int n = in.nextInt();
		int temp = n;

		/*
			1284 -> 4 digit
			1 2 8 4
			1 2 3 4 - 4 digit
		*/
		// loop
		/*
			initiative -> int count =1
			updation   -> count++;
			stoppage   -> when there is no digit left
		*/
		// (/) -> num/10 => 89/10 => 8/10 => 0/10 => 0
		// (/ ) => 0
		int count = 0;
		while (n > 0) {
			count ++;
			n /= 10;
		}
		System.out.println(count);
		int cnt = (int)Math.log10(temp) + 1;
		System.out.println(cnt);
	}

}