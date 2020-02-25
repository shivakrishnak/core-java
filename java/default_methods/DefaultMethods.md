### Default Methods

#### Rule1
Subtypes automatically carry over the default methods from their supertypes
	- If B interface extends A interface(having some default methods), then the class implementing B interface can access default methods of A interface

#### Rule2
For interfaces that contribute a default method, the implementation in a subtype  takes precedence over the one in supertypes
	- If B interface(overriding some default methods as A) extends A interface(having some default methods), then the class implementing B interface will have overridden implementation of B interface

#### Rule3
Implementation in classes, including abstract declarations, take precedence over all interface defaults.
	- Consider B interface(some default methods as A) extends A interface(having some default methods), and Z class implementing A and B, has overridden some default methods - this will take precedence over the interface implementations. 

#### Rule4
If there is a conflict between two or more default method implementations, there is a default-abstract conflict between two interfaces, the inheriting class should disambiguate(means inheriting class should implement the method)
	- Consider A and B interfaces have implemented same default method(say startGame()), and Z class implements A, B interfaces - then compiler will throw error because of ambiguity. So the inheriting class Z must implement his own startGame() to remove the ambiguity.

#### Diamond problem in interfaces?
- There is no state in the interfaces to collide unlike classes

