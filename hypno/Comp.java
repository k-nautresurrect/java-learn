/**
 *
 *  -> 1 sec 10^8
 *
 * -> constraints
 * -> Time limit
 * 		-> 1sec default
 *
 * constraints : 1 <= N <= 10^7
 * 				 -> for loop 10sec // TLE
 *
 * */

import java.lang.*;
import java.io.*;
import java.util.*;
//  Comp p  = new Comp();
//  Comp c = new Comp();
//	p.a++; <- p.a = 11
//  print(c.a) => 10

public class Comp {
	public static PrintStream o = new PrintStream(System.out);
	public static Scanner i = new Scanner(System.in);

	public static void main(String[] args) {
		// TLE
		//  - loops
		//  - recursion
		// -> 10 = 1010
		int n = 0; // 10^10, 10^15, BigInteger
		long start =  System.currentTimeMillis();
		while (n <= 100_000_000) {
			n++;
		} // O(n) tle
		long end = System.currentTimeMillis();
		o.println(end - start);
		o.println(start);
		o.println(end);
	}
}


/**
 * class ClassName {
 * 		int a = 10; // field, declaration
 *
 * 		void sum(int a) {  // method
 *
 * 		}
 *
 * }
 *
 *
 *
 * */