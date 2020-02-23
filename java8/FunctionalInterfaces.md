## Functional Interfaces
- FI is useful to create and assign lambda expressions/method references to them
- Non FI cannot be used with lambda expression
- FI can have only SINGLE abstract method
- FI can have default and static methods as long as it has single abstract method
- If an interface has single abstract method, it is inherently Functional interface,
  we need not explicitly say that.
- To convey our design intent, Optionally we can mark that interface with Annotation @FuncitonalInterface
- Eg, Runnable, Callable
- Eg, In Java8 Consumer<U>(accept single argument and gives nothing) , Supplier<U>(factory Interface), Function<U,R>(takes an object and return an object), Predicate<T>(determine true or false for a given object)
- Benefits: Functions turned into higher order function
*lambda expression is an anonymous function*

### Consumer
- it is a function that accepts a single input argument and returns no result
- Consumer is expected to operate via side-effects
- It consumes/swallows values given to it
- Side Effects like writing to log file, printing console, updating db, sending out request to webservice
- Eg. list.forEach(consumer)

### Supplier
- one method : get() - it takes nothing and returns an object of some type we indicate
- Benefits : it works as light weight factory | to post pone creation of objects = lazy creation
- Used in Optional

### Function
- it takes an input and returns an arbitrary output
- Method : apply()
- compose is reverse of andThen

### Predicate
- it evaluates a condition and decides true or false
- common usage is filter in the stream