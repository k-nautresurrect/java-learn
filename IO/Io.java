import java.util.*;
import java.io.*;

public class Io {
	public static void main(String[] args) {
		System.out.println("hello");
		Scanner in = new Scanner(System.in);
		// utf-8
		int i = in.nextInt();
		double u = in.nextInt();
		double d = in.nextDouble();
		char ch = in.next().charAt(0);
		System.out.println();
		System.out.printf("something %d\n", i);
		System.out.println(
		    ch  +  " " + u
		);

		System.out.println(Integer.MAX_VALUE);
	}
}