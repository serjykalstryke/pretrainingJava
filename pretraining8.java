// Java: Static Members

// Learning Objectives:

// Define and describe how static members work
// Successfully implement static members in a Java program

// In Java, a static member is a member of a class  that isn't associated with an instance of a class.Instead, the member belongs to the class itself. As a result, you can access the static member without first creating a class instance.

// The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keyword to variables, methods, blocks, and nester classes. The static keyword belongs to the class than an instance of the class. The static keyword is used for a constant variable or a method that is the same for every instance of a class. 

// The static keyword is a non-access modifier. It can be accessed before any objects of its class are created, and without reference to any object

// Real World Application for the Static Members Topic

// When to use static variables and methods?

// Use the static variable for the property that is common to all objects. For example, in the case of class Student, all students share the same college name. Use static methods for changing static variables. 

// Consider the following Java program, that illustrates the use of static keywords and methods

// A java program to demonstrate the use of static keyword with methods and variables

// Student Class

class Student {
  String name;
  int rollNo;

  // static variable
  static String cllgName;

  // static counter to set unique roll no
  static int counter = 0

  public Student(String name) {
    this.name = name;
    this.rollNo = setRollNo();
  }

  // getting unique rollNo
  // through static variable(counter)
  static int setRollNo() {
    counter++;
    return counter;
  }

  // static method to change the value of static variable
  static void setCllg(String name) {
    cllgName = name;
  }

  // instance method
  void getStudentInfo() {
    System.out.println("Name: " + name);
    System.out.println("Roll No: " + rollNo);
    System.out.println("College Name: " + cllgName);
  }
}

public class StaticDemo {
  public static void main(String[] args) {
    // calling static method
    // without instantiating Student class
    Student.setCllg("XYZ");

    Student s1 = new Student("John");
    Student s2 = new Student("Sam");

    s1.getStudentInfo();
    s2.getStudentInfo();
  }
}

// In the following program, we are accessing static method m1() without
// crerating any object of the Test class

class Test {
  // static method
  static method m1() {
    System.out.println("from m1");
  }

  public static void main(String[] args) {
    // calling m1 without creating nay object of class Test
    m1();
  }
}

// Static blocks

// If you need to do rhw computation in order to initialize your static
// variables, you can declare a static block that gets executed exactly once,
// when the class is first loaded.

// Consider the following java program demonstrating the use of static blocks

class Test
{
  // static variables
  static in a = 10;
  static int b;

  static {
    system.out.println("Static block initialized.");
    b = a * 4;
  }

  publis static void main(String[] args)
  {
    System.out.println("from main");
    System.out.println("Value of a: " + a);
    System.out.println("Value of b: " + b);
  }
}

// Output:
// Static block initialized.
// from main
// Value of a: 10
// Value of b: 40

// Static variables
// When a variable is declared as static, when a single copy of the variable is
// created and shared among all objects at the class level. Static variables
// are, essentially, global variables. All instances of the class share the same
// static variable.

// Important points for static vriables:

// When we create static variables at the class level only
// Static block and static variables are executed in the order they are present
// in a program
// Below is the Java program to demonstrate that static block and static
// variables are executed in the order they are present in a program

class Test {
  // Static variable
  static int a = m1();

  // static block
  static {
    System.out.println("First static block");
  }

  static int m1() {
    System.out.println("from m1");
    return 20;
  }

  // public static void main(String[] args)
  {
    System.out.println("Value of a: " + a);
    System.out.println("from main");
  }

  // Output:
  // from m1
  // First static block
  // Value of a: 20
  // from main

  // Static methods
  // When a method is declared with the static keyword, it is known as a static
  // method. The most common example of a static method is the main() method. As
  // discussed above, any static member can be accessed before any objects of its
  // class are created, and without reference to any object. Methods declared as
  // static have several restrictions:

  // They can only directly call other static methods.
  // They can only directly access static data.
  // They cannot refer to this or super in any way.

  // Example of static methods:

  // Java program to demonstrate restriction n static methods

  class Test {
    // static variable
    static int a = 10;

    // instance variable
    int b = 20;

    // static method
    static void m1() {
      // static method can only access static data
      a = 20;
      System.out.println("from m1");

      // Cannot make a static reference to the non-static field b
      b = 10; // compilation error

      // Cannot make a static refgerence to the non-static method m2() fromthe type
      // Test
      m2(); // compilation error

      // Cannot use super in a static context
      System.out.println(super.a); // compilation error
    }

  }

  void m2() {
    System.out.println("from m2");
  }

  public static void main(String[] args) {
    // main method
  }

}