### Method References
- when a lambda expression does nothing but call an existing method, we can use method reference to call existing method by name.
- where parameter just passes through parameters. Compiler takes parameter and sends it as an arguement. 
- they stand in for lambda expression where in the parameter is merely passed to a method.
- To make code concise, to pass more meaningful names and code becomes more expressive
- Method Reference to an Instance Method -> objectName::methodName
- Method Reference to an Static Method -> ClassName::staticmethodName
- Method Reference: Passing Parameter as an Argument
	-	In case of overloading method, compiler will check for the type. if the type does not exist, then compiler will error it. Ex , passing int value to string method.
- Ambiguity 
	-	when two methods(one static and one non-static) having same name, then if we use Method reference as Type::method() , compiler will throw error due to ambiguity
	-	In the above, it is better to handle code so that both methods have different name.
	- 	Use MR in non-ambigous context


