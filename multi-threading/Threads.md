### Threads

##### Join()
-	When we invoke join() method on a thread, the calling thread goes into waiting state. It remains in the waiting state until the referenced thread terminates.
- Eg. A thread calls B.join(), then A thread will wait till B thread finishes its task

##### Volatile
- Every read of a volatile variable will be read from the RAM - from the main memory, not from the cache 
- Usually variables are cached for performance reasons. Every thread has its own CPU and Cache. Caches are faster.
- Performance is impacted if volatile is used as it is makes app slower

##### Deadlock
- Deadlock is a situation in which two or more competing actions are each waiting for the other to finish, and thus never moves forward
- Databases -> deadlock happens when two processes each within its own transaction updates two rows of information but in the opposite order. For example, process A updates row1 then row 2 in the exact time frame that process B updates row 2 then row 1

##### Livelock
- A thread often acts in response to the action of another thread.
- If the other thread's action is also a response to the action of another thread is Livelock
- Livelocked threads are unable to make further progress. However the threads are not blocked , they are simply too busy responding to each other to resume work.
- Eg, when two people attempting to pass through narrow path, A moves left to let B pass, while B moves right to let A pass. They are blocking each other 

##### Synchronized
- Synchronized Method > Class Intrinsic lock 
- Synchronized Block > Method Intrinsic lock 