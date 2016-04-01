/*
Mandi Fuccillo
CS3810 Data Structures and Algorithms
Spring 2016
3/08/2016
Assignment Two: Deque // Assignment 2 (Ch4 Stacks and Queues)

Assign date: 3/8/16
Due date: 3/22/16

1.	Create a circular class, MyDeque, based on the discussion of the deques (p. 143) in this chapter. It should include the following methods:
insertFront()
insertRear()
removeFront()
removeRear()
peekFront()
peekRear()
isEmpty()
isFull()
toString()
•	You may create the class by updating the existing class Queue.java in page 138 of the textbook.
•	For practicing purpose, assume that the deque contains stock items. Each item consists two data:
	Item# (String)
	Item price (double)
Create a class called Item. Each element in the deque is an object of the Item class. The class should include set/get methods and toString() method.
•	The deque is a circular queue which needs to handle wrap-around.
•	Refer the given methods in the example class (Queue.java in page 138) to define the API of the class. It means that define the signature (method header) of the constructor(s) and each above method before coding. Any ‘remove’ method should return the removed item.

2.	The toString() in MyDeque should always display the data stored in the deque in the sequence from ‘front’ to ‘rear’.

3.	Since the deque is a circular queue, need to handle wrap-around when ‘peek’,

4.	Write an application class to test all methods defined in MyDeque class. The application should allow the user to decide the length of the deque and operate on the queue as many times as he/she wants till ‘Quit’.
The selections for users are:
1)	Insert to front
2)	Insert to rear
3)	Remove from front
4)	Remove from rear
5)	Peek front
6)	Peek rear
7)	Display queue
8)	Quit
[Note: For an insertion operation, you have to prompt the user to type in the item# and the price. Create an object of the Item and then pass the object as the argument to the insertion method.]
You should test the functions as thoroughly as you can. For example, one of the tests could be:
a)	Insert 4 elements to rear
a)	Remove 2 elements from front
b)	Insert 3 elements to rear
c)	Remove 3 elements from rear
d)	Insert 3 elements to front
Display the contents in the deque frequently during the test to check the correctness of the functions.

5.	Write a program to implement a stack class by using the Deque class you implemented. This implementation uses a technique called Delegation. See Note below. It should include the following methods:
push(), pop(), peek(), isEmpty(), isFull()
The element type is Item.
To avoid the name conflict with the Stack class defined in Java library, please pick any name other than Stack for your class.
	[Note: Implementing the delegation relationship: Define a deque object in the stack class, and then use any existing methods of the deque to implement the functions of the stack. Don’t use the ‘inheritance’ relationship.]

6.	Write an application class or a test main() to test the stack class. You have to test all methods defined in the class.

7.	For all methods and applications you write, give comments (top doc before each method, not only // comments by the side of the sentences) to explain your strategy.

8.	Make all screen-output meaningful to the user.

9.	Submission:
•	Item class
•	MyDeque class
•	MyDequeApp class
•	MyStack class
Each class should be in an individual file. Zip all files and submit the zip file.

Comments from Dr. Hai:
Feedback to Learner 3/26/16 3:58 PM

1) insertFront() and removeRear(): wrong implementations;
2) peeks: Need wrap-around.
3) MyStack class: did not use delegation.

Fix problems and resubmit. If you need help, see tutors or me.
*/