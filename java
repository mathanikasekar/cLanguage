Frameworks
 -large bodies of pre-written code
 -which you  can add your own code in order to solve a problem.
 -You make use of a framework by calling its methods, inheritance, and supplying callbacks, listeners, or other implementations of the patterns.
FRAMEWORKS IN JAVA:
Spring, hibernate,
Spring:
•	Web application development
•	Its features can be used to create any Java application
•	Its also used in Enterprise Java (JEE)
Companies using spring:
•	Netflix using Spring boot
•	Yatra uses Spring MVC
•	Amazon
•	eBay
Hibernate:
makes better communication possible between the Java programming language and relational database management systems (RDBMS).
OO languages and RDBMSs handle the data differently, which can lead to severe mismatch problems. So, this Hibernate provides you with a framework that overcomes the mismatch problems of Java.
Applications written in C:
Applications written in  JAVA:
Netflix,tinder,uber

JAVA:
high-level programming language
developed by james gosling at sun microsystems
class-based, purely object-oriented programming language
ADV:
Platform independent
Both interpreter and compiler
Multithreading-perform many tasks at the same time
DIS ADV:
slow, poor performance
takes more memory
no backup facility
APPLICATION:
used to develop applications
(mobile applications-twitter)
(gaming applications-space invader)
OBJECT ORIENTED CONCEPTS:
Class:
basic entity
blueprint for behavior/state the object
accessed with help of OBJECT
Object:
basic entity
instance of class
states(data) and behavior(methods)
dog states - color, name, breed
behaviors –barking, eating
Inheritance:
process where one class acquires the properties (methods and fields) of another
which inherits(sub class)
whose properties inherited(super class)
class-class,interface-interface(extends) otherwise(implements)


Encapsulation:
Polymorphism:
Abstraction:
Package:
(collection of interrelated class and interface) under a common name

MULTI THREADING:
two or more parts of program that can run concurrently
each part can handle a different task at the same time
each of the threads can run in parallel
multiple processes share common processing resources such as a CPU
A web browser can download any number of files and web pages (multiple tabs) at the same time and still lets you continue browsing. If a particular web page cannot be downloaded, that is not going to stop the web browser from downloading other web pages.
THREAD STATES:
New.
Runnable.
Blocked.
Waiting.
Timed Waiting.
Terminated
PRIORITY:   ****************************************************************
thread priorities are in the range between MIN_PRIORITY (a constant of 1) and MAX_PRIORITY (a constant of 10).
By default, every thread is given priority NORM_PRIORITY (a constant of 5).
CREATION:
two ways to create a thread:
  -extending Thread class
  -implementing Runnable interface.
Methods:
1.	public void run(): is used to perform action for a thread.
2.	public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
3.	public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.

4.	public void join(): waits for a thread to die.
5.	public void join(long miliseconds): waits for a thread to die for the specified miliseconds.

6.	public int getPriority(): returns the priority of the thread.
7.	public int setPriority(int priority): changes the priority of the thread.

8.	public String getName(): returns the name of the thread.
9.	public void setName(String name): changes the name of the thread.
10.	public Thread currentThread(): returns the reference of currently executing thread.
11.	public int getId(): returns the id of the thread.
12.	public Thread.State getState(): returns the state of the thread.
13.	public boolean isAlive(): tests if the thread is alive.
14.	public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
15.	public void suspend(): is used to suspend the thread(depricated).
16.	public void resume(): is used to resume the suspended thread(depricated).
17.	public void stop(): is used to stop the thread(depricated).

18.	public boolean isDaemon(): tests if the thread is a daemon thread.
19.	public void setDaemon(boolean b): marks the thread as daemon or user thread.
20.	public void interrupt(): interrupts the thread.
21.	public boolean isInterrupted(): tests if the thread has been interrupted.
22.	public static boolean interrupted(): tests if the current thread has been interrupted.
Daemon thread:
low priority thread
runs in background to perform tasks such as garbage collection
service provider thread that provides services to the user thread
USER THREAD                                                            DAEMON THREAD
High priority                                                                  low priority
Runs in foreground                                                      background
do specific or complex task                                         perform supporting tasks
JVM will not terminate the program                              JVM will terminate the program
GARBAGE COLLECTION:

-automatic memory management
- When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.
Not in c, c++ only in java
