//Java: Testing through the main() method

// Learning Objectives for the Methods topid:

// Understand what a method is and when to use a method

// Identify the different parts of a method

//What is a method?

//A method is a block of reusable code that can be invoked multiple times

//Parts of a method:

//1. Method name: We give our method a name so that we can identify it from other methods.
//2. Method parameters: We can pass data into a method through parameters. Parameters are variables that are defined within the method's parenthesis.
//3. Return type: The datatype that we are going to return from the method

// Let's identify the three parts in the addNumbers writtenbelow:

int addNumbers(int,num1,int num2){return num1+num2;}

// The method name of this specific method is the text right before the parenthesis. So the method ame of this specific method is addNumbers.

// The method parameters are the variables that are defined within the parenthesis. In this specific method, the method parameters are num1 and num2.

// The return type is the datatype that we are going to return from the method. In this specific method, the return type is int.

// How do we Invoke a method?

// Let's say we wanted to call our newly created addNumbers method. We can do that as shown below:

public class Main {
  public static void main(String[] args) {
    addNumbers(1, 3);
  }}

  // In the above example, we are invoking the addNumbers method from our main
  // method. All we needed to do was type out the method name adn provide the
  // values required to the parameter list. In the above example, we aren't
  // storing the result of the method, however we can do this by assigning the
  // value to a variable.

  // Java: Primitive Data Types

  // Learning Objectives of the Primitive Types
  // Understand what a variable is in a programming language
  // List the primitive data types and their respective memory allocations

  // Description of the Primitive Types topic
  // A variable is a container for storing data. This is a key element of any
  // programming language

  // Syntax for a variable in java

  datatype variableName = value;

  // Let's break that down: The variable name is the unique identifier used to
  // reference the variable. The term datatype refers to the type of data that can
  // be stored int he variable. Java is sometimes called a strongly typed language
  // because when you declare a variable, you must specify the variable's type.
  // Then the compiler ensures that you don't try to assign the wrong type to the
  // variable. The following example would generate a compiler error:

 int x;

  x=3.1415

  // because x is declared as a variable of type int (which hold intiget values),
  // it is not legal to assign the floating point value 3.1415 to it.

  // Java makes an important distinction between primitive types and reference
  // types.

  // Primitive types are the data types defined by the language itself

  // Reference types are types defined by classes in the Java application
  // ProgrammingInterface (API) or by classes you create rather than by the
  // language itself.

  // A key difference between a primitive data type and a reference type is that
  // the memory location associated with a primitive-type variable contains the
  // actual value of the variable. As a result, primitive types are sometimes
  // called value types. By contrast, the memory location associated with a
  // reference-type variable contains an address (called a pointer) that indicates
  // the memory location of the actual object.

  // Java defines a total of eight primitive types, listen in the table below. Of
  // the eight primitive types, six are for numbers, one is for characters, and
  // one is for true/false values.

  // To memorize a total of eight primitive types, listed in the table below. Of
  // the eight primitive types, six are for numbers, one is for characters, and
  // one is for true/false values.

  // To memorize the 8 primitive datatypes of java, we have developed a saying:
  // Bitter black coffee sure is for lng days

  // The first letter of each word in the saying represents the first letter of
  // each primitive datatype. The saying is as follows:

  // Bitter = boolean
  // Black = byte
  // Coffee = char
  // Sure = short
  // Is = int
  // For = float
  // Long = long
  // Days = double

  // Why are there primitive data types in java?

  // For efficiency. Variables of primitive types contain the value directly;
  // variables of non-primitive types are references, referring to an object
  // stored somewhere else in memory.

  // Each time you need to use the value of a wrapper type,the JVM needs to look
  // for the object in memory to get the value. This isn't needed for primitive
  // types, because the variable contains the value itself, instead of a reference
  // to an object that contains the value.

  // However, that doesn't explain why primitive types need to be explicitly
  // visible int he Java programming language. The designers of the Java language
  // and the JVM could have chosen to hide primitive types from the language
  // itself, so that you could treat everything as an object. The compiler could
  // then translate it under the covers to more efficient primitive types.

  // Some newer programming languages that run ont he JVM let you do exactly that:
  // in the language itself, everything looks like an object, which you can for
  // example, call methods on,but below the covers the compiler translates them to
  // primtives.

  // Here is a list of examples of each Primitive Types:

  // boolean datatype (true or false)
  boolean bool = true;

  // byte datatype (whole number between -2^8 to (2^8)-1)
  byte b = 127;

  // char datatype (1 character)
  char c1 = 'B';

  // short datatype (whole number between -2^16 to (2^16)-1)
  short s = 32767;

  // int datatype (whole number between -2^32 to (2^32)-1)
  int i = 2147483647;

  // float datatype (floating point numbers (less accurate))
  float f = 1.234;

  // long datatype (whole number between -2^64 to (2^64)-1)
  long l = 9223372036854775807;

  // double datatype (floating point numbers (more accurate))
  double d = 1.234;

  // Working with Basic Operators

  // Learning Objectives of the Basic Operators topic
  // Discuss the Different types of Operators
  // Discuss the different operators in each type in Java
  // Successfully execute a Java program that demonstrates the usage of different
  // Java operators

  // Description for the Operators topic

  // Operators

  // There are several different operators in Java. We have already seen the
  // assignment operator (=) which assigns a reference variable to a primitive
  // value or object.

  // Increment and decrement operators
  // In order to increment or decrement integral values, we can use the common
  // postfix operators: x++ and x--, where x is a byte, short, int, or long. A
  // similar operator is the prefix increment and decrement: ++x and --x. The
  // difference is that the prefix operator will change the value before the rest
  // of the expression is evaluated, while the postfix operator changes the value
  // after the entire expression is evaluated.

  int a = 5; // this is an example of the assignment operator
  it b = a++ // this is an example of the postfix increment operator
  int c = ++a // this is an example of the prefix increment operator
    System.out.println(a); // this will print out 7
  System.out.println(b); // this will print out 5
  System.out.println(c); // this will print out 7

  // Logical Operators

  // There are a few logical operators that Java programmers must know:

  // && (and) - this operator compares two boolean values and if both are true, it
  // returns true, otherwise this is false

  // || (or) - this operator compares two boolean values and if either is true, it
  // returns true, otherwise this is false

  // \ ! (not) - this operator takes a boolean value and inverts it

  // Ternary Operator
  // The ternary operator uses this syntax:

  x=condition?expr1:expr2;

  // If the condition is true, x is assigned the value of expr1; if the condition
  // is false then expr2 is assigned.

  // Operator precedence

  // The operators below are listen in order of precedence:

  Operators Precedence
postfix	expr++expr--unary++expr--expr+expr-expr~!multiplicative*/%additive+-shift<<>>>>>relational<><=>=instanceof equality==!=
  bitwise AND&
bitwise exclusive OR^
bitwise inclusive OR|
logical AND&&
logical OR||ternary?:assignment=+=-=*=/=%=&=^=
  Operators Precedence
  postfix expr++expr--unary++expr--expr+expr-expr~!multiplicative*/%additive+-shift<<>>>>>relational<><=>=instanceof equality==!=
  bitwise AND&
bitwise exclusive OR^
bitwise inclusive OR|
logical AND&&
logical OR||ternary?:assignment=+=-=*=/=%=&=^=

  // Java Unary Operators:

  // The Java unary operators require only on operand. Unary operators are used to
  // perform various operations such as:

  // incrementing/decrementing a value by 1
  // Negating an expression
  // Inverting the value of a boolean

  // Java Unary Operator Example ++ and --:

  public class OperatorExample {
  public static void main(String args[]) {
    int x=10;
    System.out.println(x++);//10 (11)
    System.out.println(++x);//12
    System.out.println(x--);//12 (11)
    System.out.println(--x);//10

  }
  }

  // Java Unary Example ~ and !:

  public class OperatorExample {
    public static void main(String args[]) {
      int a = 10;
      int b = 10;

      boolean c = true;
      boolean d = false;

      System.out.println(~a);// -11 (minus of total positive value which starts from 0)
      System.out.println(~b);// -11 (minus of total positive value which starts from 0)
      System.out.println(!c);// false (opposite of boolean value)
      System.out.println(!d);// true (opposite of boolean value)

    }
  }

  // Java arithmetic operators:

  // The Java arithmetic operators are used to perform basic mathematical
  // operations such as addition, subtraction, multiplication, division, modulus,
  // etc.

  // Java Arithmetic Operator Example +, -, *, /, %:

  // An example of the Java arithmetic operators:

  public class OperatorExample {
    public static void main(String args[]) {
      int a = 10;
      int b = 5;
      System.out.println(a + b);// 15
      System.out.println(a - b);// 5
      System.out.println(a * b);// 50
      System.out.println(a / b);// 2
      System.out.println(a % b);// 0
    }
  }

  // Java AND Operator Example: Logical && and Bitwese &:

  // The logical Operator && doesn'tcheck the second condition if the first
  // condition is false. It checks the second condition only if the first one is
  // true. The bitwise & operator always checks both conditions first.

  // An example of the Java logical && and bitwise & operators:

  public class OperatorExample {
    public static void main(String args[]) {
      int a = 10;
      int b = 5;
      int c = 20;
      System.out.println(a < b && a < c);// false && true = false
      System.out.println(a < b & a < c);// false & true = false
    }
  }

  // Java OR Operator Example: Logical || and Bitwese |:

  // The logical Operator || doesn't check the second condition if the first
  // condition is true. It checks the second condition only if the first one is
  // false. The bitwise | operator always checks both conditions first.

  // An example of the Java logical || and bitwise | operators:

  public class OperatorExample {
    public static void main(String args[]) {
      int a = 10;
      int b = 5;
      int c = 20;
      System.out.println(a > b || a < c);// true || true = true
      System.out.println(a > b | a < c);// true | true = true
      // || vs |
      System.out.println(a > b || a++ < c);// true || true = true
      System.out.println(a);// 10 because second condition is not checked
      System.out.println(a > b | a++ < c);// true | true = true
      System.out.println(a);// 11 because second condition is checked
    }
}
