## Java8

##### Lambda Expressions
- lambda expression is an anonymous function
- enables you to treat functionality as an arguement and code as data.
- 

##### Interfaces vs Abstract Method
- Interfaces cannot have state while abstract classes can have state
	-	Interfaces cannot have fields(private int id;) in them, compiler will throw error
- We can extend only one abstract class but can implement many interfaces
- Interfaces are more preferable than abstract classes - golden rule - Interfaces dont have implementation and are extensible

##### Interface Methods
- Can have default and static methods
- use super to call instance method and Interface name to call static method

##### Inner Classes
- Final
	- 	once variable is declared, it becomes immutable
	- 	final field can be initialized only once in possible 3 places : declaration, static block or constructor
- Inner Classes
	-	classes that can be defined within another class or a function
	-	if non-final parameter is passed to a inner class, that variable will not be in context of the inner class , hence we have to declare variable as final