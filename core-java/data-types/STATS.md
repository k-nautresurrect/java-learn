 # Data types in java
- Primitive :
	## Integer
	- Byte
	- Short
	- Integer
	- Long
	## Decimals
	- Float 
	- Double
	## Character/Alphabets
	- Char
	## TRUE/FALSE
	- Boolean

- when printing an Integer (excluding float)
it by default streams an output of (int) if the limit exceeds, by performing operation on int in print statement it is recommended to convert it in other data type or it will overflow
	- eg: ```print(Integer.MAX_VALUE + (-INTEGER.MIN_VALUE))``` will not work
	- ```print((long) Integer.MAX_VALUE + Integer.MAX_VALUE - 1)``` will work
	- ```print((-1 * Integer.MIN_VALUE))``` will also not work
	- ```print(Integer.MAX_VALUE - 1)``` will work


