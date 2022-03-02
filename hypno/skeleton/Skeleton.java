/*
	-> Dependencies
		-> os - hardware connection
			-> kernel
			-> api
	-> C++ : header files -> stdio, iostream
	-> python : dunders -> __main__, __init__
	-> java : package, class -> java.lang, java.io, java.util

*/


/*
if __name__ = "__main__":

	i = 0;
	i = i+1;
*/

/*
#include <dependency.h>

int main(){

}

*/
/*
import depency.file;

class ClassName {
	public static void main(String[] args) {

	}
}
	java -> class -> execute
	native-> Byte -> Binary
	code     code    code
*/

class Skeleton {
	// filed class variable
	public static void main(String[] args) {
		name n = new name();
		name n2 = new name();

		System.out.println(n.i);
		System.out.println(n2.i);
		n.i += 1;
		System.out.println(n.i);
		System.out.println(n2.i);

		// if new is there then heap
		// else intern pool -> String
		// else stack -> primitive data type
		System.out.println("hello");
		// method variable
	}
}

class name {
	static int i = 10; // field
}