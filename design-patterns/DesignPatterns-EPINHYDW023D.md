### Design Patterns
- Encapsulate what varies
- Program to an Interface, Not an Implementation
- Strive for loosely coupled designs between objects that interact - Loose Coupling

#### Strategy Pattern
- This pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable
- This lets the algorithm vary independently from clients that use it
- Design Principles used 
	- Encapsulate what varies
	- Program to an Interface, Not an Implementation
	- We are using HAS-A relationship
	- Instead of inheriting behavior, we are composing it.

**IS-A is Inheritance Relationship**

**HAS-A is Composition Relationship**


#### Adapter Pattern
- 	This pattern converts the interface of a class into another interface that client expects.
- 	It allows classes to work together that couldn't otherwise because of incompatible interfaces
- 	Example: Type C charger Phone and Non-type C charger = Type C charger Phone <- adapter(connector) <- Non-type C charger 

#### Observer Pattern
-	This pattern defines a one-to-many dependency between objects so that when one object changes state, all of 	its dependents are notified and updated automatically.
- Design Principles used
	- 	Strive for loosely coupled designs between objects that interact - Loose Coupling
	
#### Decorator Pattern
-	This pattern attaches additional responsibilities to an object dynamically.
-	Decorators provide a flexible alternative to subclassing for extending functionality.

#### Iterator Pattern
-	This pattern provides a way to access the elements of an aggregate object sequentially without exposing 	it's underlying representation
- 	Aggregate objects = arrays,list,set etc

#### Factory Method Pattern
-	The factory method pattern defines an interface for creating an object, but lets subclasses decide which 	class to instantiate.
-	Factory method lets a class defer instantiation to subclasses
