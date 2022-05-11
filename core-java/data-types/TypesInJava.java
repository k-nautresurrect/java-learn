import java.lang.*;
import java.math.BigInteger;

public class TypesInJava {
	public static void main(String[] args) {
		// Data types in java

		// integer values
		byte a = Byte.MAX_VALUE;
		byte aS = Byte.MIN_VALUE;

		short sh = Short.MAX_VALUE;
		short shS = Short.MIN_VALUE;

		int i = Integer.MAX_VALUE;
		int iS = Integer.MIN_VALUE;

		long l = Long.MAX_VALUE;
		long lS = Long.MIN_VALUE;

		// Decimal values
		float f = Float.MAX_VALUE;
		float fS = Float.MIN_VALUE;

		double d = Double.MAX_VALUE;
		double dS = Double.MIN_VALUE;

		// Character
		int ch = Character.MAX_VALUE;
		int chS = Character.MIN_VALUE;

		System.out.println(a + " " + aS);
		System.out.println(sh + " " + shS);
		System.out.println(i + " " + iS);
		System.out.println(f + " " + fS);
		System.out.println(d + " " + dS);
		System.out.println(l + " " + lS);
		System.out.println(ch + " " + chS);
		System.out.println();
		System.out.println();

		byte number = 7;
		byte countDiv = 0;
		long div = 255;
		while (((a + (-aS)) / div) != 0) {
			countDiv++;
			div *= 255;
		}

		System.out.println(countDiv);
		countDiv = 0; div = 255;

		while (((long)i + i - 1) / div != 0) {
			countDiv++;
			div *= 255;
		}

		System.out.println(countDiv);
		countDiv = 0; div = 255;


		while ((sh + (-shS)) / div != 0) {
			countDiv++;
			div *= 255;
		}

		System.out.println(countDiv);
		countDiv = 0; div = 255;

		BigInteger fl = BigInteger.valueOf(255);
		for(int j = 0; j<6; j++) fl = fl.multiply(BigInteger.valueOf(255));
		System.out.println(fl);

		// inbuilt size 
		byte sizeBy = Byte.BYTES;
		short sizeShort = Short.BYTES;
		short intSize = Integer.BYTES;
		short longSize = Long.BYTES;
		short chSize = Character.BYTES;

		System.out.println(sizeBy);
		System.out.println(sizeShort);
		System.out.println(intSize);
		System.out.println(longSize);
		System.out.println(chSize);
	}
}