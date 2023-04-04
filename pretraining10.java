// Java: Stack and Heap Memory

// Learning Objectives for Stack and Heap Memory:

// Identify and describe the terms stack and heap

// To run an application in an optimal way, JVM divides memory into stack and heap memory. Whenever we declare new variables and Objects, call a new method, declare a String or perform similar operations, the JVM designates memory to these operations from either Stack Memory or Heap Space.

// In this tutorial, we'll examine these memory models. First, we'll explore their key features. Then we will explore how they are stored in RAM, and where to use them. Finally, we will explore the key differences between stack and heap memory

// Stack Memory in Java

// Introduction

// Stack Memory in Java is used for static memory allocation and the execution of a thread. It contains primitive values that are specific to a method and references to objects referred from the method that is in a heap. 

// Access to this memory is in Last-In-First-Out (LIFO) order. Whenever we call a new method, a new block is created on top of the stack which contains values specific to thast method, like primitive variables and references to objects

// When the method finishes execution, its corresponding stack frame is flushed, the flow goes back to the calling method, and space ebcomes available for the next method.

// Key Features of Stack Memory

// It grows and shrings as new methods are callled and returned, respectively
// Variables inside the stack exist only as long as the method that created them is running
// It's automatically allocated and deallocated when the method finishes execution
// If this memory is full, Java throws java.lang.StackOverFlowError
//Access to this memory is fast when comapred to heap memory
// This memory is threadsafe, as each thread operates in its own stack

// Heap Space in Java

//Introduction
// Heap Space is used for the duynamic memory allocation of Java objects and JRE classes at runtime. new objects are always created in heap space, and the references to these objects are stored in stack memory

// These objects have global access and we can access them from anywhere in the application

// We can break thisd memory model down into smaller parts, called generations, which are: 
// Young Generation: This is where all new objects are allocated adn aged. A minor Garbage collection occurs when this fills up
// Old or Tenured Generation - this is where all new objects are allocated adn aged. A minor Garbage collection occurs when this fills up.
// Permanent Generation - this consists of JVM metadata for the runtime classes and application methods.

// Key Features of Java Heap Memory
// Heap memory is accessed via complex memory management techniques that include the Young Generation, Old or Tenured Generation, and Permanent Generation
// If heap space is full, java.lang.OutOfMemoryError is thrown
// Access to this memory is comparatively slower than stack memory
// This memory, in contrast to stack, isn't automatically deallocated. It needs Garbage Collection to free up unused objects so as to keep memory usage efficient.
// Unlike stack, a heap isn't threadsafe and needs to be guarded by properly synchronizing the code

// Application of Stack and Heap Memory

// Based on what we have learned, let's analyze a simple Java Program to assess how to manage memory:

class Person {
  int id;
  String name;

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }
}

public class PersonBuilder {
  private static Person buildPerson(int id, String name) {
    return new Person(id, name);
  }

  public static void main(String[] args) {
    int id = 23;
    String name = "John";
    Person person = null;
    person = buildPerson(id, name);
  }
}

// In this program, we have a Person class with two instance variables, id and
// name. We have a buildPerson() method that returns a new Person object. We
// have a main() method that creates a Person object and assigns it to the
// person variable.

// Let's try another:

public class Stack {

  private int lastItem = 0;
  private int[] items = new int[0];

  public void push(int newItem) {

  }

  public int pop() {
    return 0;
  }

  public int peek() {
    return 0;
  }

}

  // This is the basic outline that we will implement functionality onto

  // Implementing push

  public void push(int newItem) {

    int index = items.length;
    items = new int[items.length + 1];
    items[index] = newItem;

    lastItem = newItem;
  }

  // Implementing pop

  public int pop() {
    int tempItem = lastItem;

    int[] newArray = new int[items.length - 1];

    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = items[i];
    }

    items = newArray;
    lastItem = items[items.length - 1];

    return tempItem;
  }

  // So our final code looks like this:

  public class Stack {

    private int lastItem = 0;
    private int[] items = new int[0];

    public void push(int newItem) {

      int index = items.length;
      items = new int[items.length + 1];
      items[index] = newItem;

      lastItem = newItem;
    }

    public int pop() {
      int tempItem = lastItem;

      int[] newArray = new int[items.length - 1];

      for (int i = 0; i < newArray.length; i++) {
        newArray[i] = items[i];
      }

      items = newArray;
      lastItem = items[items.length - 1];

      return tempItem;
    }

    public int peek() {
      return lastItem;
    }

  }

  // Now let's design a test case for this code:

  public class TestStack {

    public static void main(String[] args) {
      Stack stack = new Stack();

      stack.push(1);
      stack.push(2);

      int value = stack.pop();

      System.out.println(value);
      System.out.println(value);
    }
  }

  // Now let's run this code and see what happens:

  // 2
  // 2

  // So we can see that the pop() method is returning the last item in the stack,
  // which is 2. This is because we are setting the lastItem variable to the last
  // item in the stack, and then returning that value. So let's fix this:

public int pop() {
  int tempItem = lastItem;

  int[] newArray = new int[items.length - 1];

  for(int i=0; i < newArray.length; i++){
    newArray[i] = items[i];
  }

  items = newArray;
  lastItem = items[items.length - 1];

  return tempItem;
}

// Now let's run this code again:

// 2
// 1

// So now we can see that the pop() method is returning the correct value. This
// is because we are setting the lastItem variable to the last item in the
// stack, and then returning that value.
