/* #include <stdio.h>
	int i = 10;
	printf("hello");
    int main() {

    }
 */
/**
 * static  -> entrypoint
 * -> Main
 *
 * java -> class file
 *
 * dynamic -> module <= file
 * python -> dunders -> __main__
 * js -> window,  nodejs -> document
 *
 * */

import java.lang.*; // default
// class name -> name in file
// in any java file only one class should be public
// class Main { }
public class Skeleton {

	// System.out.println("hello");
	int i = 10;
	// compile -> building stage
	// repl -> interpretation
	/*
		run eval print loop
	*/

	// javac Skeleon.java
	// java Skeleton
	public static void main(String[] args) {
		System.out.print("running");
	}
}