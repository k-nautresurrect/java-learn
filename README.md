# java-learn

## initialization
- skeleton of java
	- classes
	- how classes compile
- main
	- the main method
	- using imports
- static
	- static in terms of mem
	- static in terms of class
- javap
	- .class file to .java
	- peeking in 
- javac
	- compiling single file
	- compiling entire package
	- Build tools
		- ant
		- maven
		- gradle
- java
	- running file without compile
	- java as an repl
- ByteCode signature
	- signature of any class
	- next level of bytecode


## java architecture
- how java works
	- jdk
	- jre
	- jvm
- inside look of jvm
	- class loader
		- loading
		- linking
		- initialisation
	- jvm memory
		- method area
		- heap area
		- stack
			- threads
		- pc registors
			- thread pc
		- native method stack
	- execution engine
		- Interpretor
		- jit compiler
		- garbage collection
	- native method
		- native method interface
		- native method library
- how the execution is done

## good first programs
- input/ output
	- producing output
		- System.out
		- PrintStream
	- taking input
		- Scanner (System.in)
		- Input via buffer reader
- variables/data type
	- primitive type
		- Int type
		- Float type
		- Double type
		- Char type
	- Wrapper classes
	- type casting
		- coercion
		- explicit
- maths operators
	- airthematic
		- ```+, *, -, /, % ```
	- relational
		- ```==, !=, <, >, <=, >= ```
	- assignment
		- ```=, +=, -=, *=, /=, %= ```
	- logical
		- ```&&, || ```
	- bitwise
		- ```&, |, ^, ~, >>, <<, >>> ```
	- conditional
		- ```? : : ```
- control
	- Decision
		- if, else, elseif
		- switch
	- Loops
		- do while
		- while
		- for
		- for-each
	- Jump
		- break
		- continue
		- return*

## derived programs
- numbers
	- counting numbers
	- max of elements
	- odd even using bitwise
	- swap
	- sum of numbers
	- sum of digits
	- print reverse number
	- print pallindrome
	- armstrong
- pattern
	- ```
		1  
		11  
		111   
		1001   
		11111  
		100001 ```
	- ```
		0  
		1    1  
		2    3    5  
		8   13  21  34 ```

- primes
- divisors/ factors
- combinatorics
- counting
- expresion vs coercion