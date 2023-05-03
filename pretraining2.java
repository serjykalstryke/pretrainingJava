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

  // The logical Operator || doesn'tcheck the second condition if the first
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

  // Java Ternary Operator

  // The ternary operator is used as a one line replacement for if-then-else
  // statements and is used a lot in Java programming. it is the only conditional
  // operator that takes three operands. The syntax of the ternary operator is:

  public class OperatorExample {
  public stating void main(String args[]) {
    int a=2;
    int b=5;
    int min=(a<b)?a:b;
    System.out.println(min);
  }
  }

  // String Basics

  // Learning Objextives for the String Basics Topic

  // Discuss the String class
  // Successfully execute a Java program that demonstrates different operations on
  // Strings using the String API.

  // Description for the String Basics topic.

  // Strings are a commonly used reference type in java to hold multiple
  // characters (text).

  // In Java, Strings are NOT primitives - they are immutable, constant objects
  // derived from the String class. To be immutable means that the state or value
  // of the object cannot be altered once created - this is accomplished by having
  // internal, private and final fields and not implementing any "setter" methods
  // which would alter the state of those fields.

  // Because Strings are immutable, all of the methods in the String class return
  // a new String - the original is not modified. For example:

  String str1 = " my string";

  str1.concat(" is the best!")System.out.println(str1);

  // The output of this code is "my string" - the original String is not modified.

  // Unique Properties of Strings in Java
  // Strings are very crucial in Java and also are very frequently used by Java
  // programmers. It is important that the Java developers have a good knowledge
  // about the String class, in order to used them effectively. In this article,
  // we will be focusing on some of the important topics about Java Strings.

  // Strings dot not use any null character for termination.

  // Strings does not use any null character for termination. Strings are backed
  // by the character array. Programmers can use the character array to represent
  // a String in the Java programming language. The can do this by using the
  // toCharArray() method. The toCharArray() method of java.long.String class
  // converts this string into a new character array. The following example shows
  // how to use the toCharArray() method to convert a String into a character
  // array.

  public class StringExample {
    public static void main(String args[]) {
      String str = "Hello World";
      char[] ch = str.toCharArray();
      for (int i = 0; i < ch.length; i++) {
        System.out.print(ch[i]);
      }
    }
  }

  // Strings are not modifiable

  // One thing Java programmers must be aware of is that Strings are immutable,
  // which means that once the programmer creates a string, it cannot be modified.
  // If the programmer tries to modiy the content of a string, a new string is
  // created. The following example shows how to modify a string.

  public class StringExample {
    public static void main(String args[]) {
      String str = "Hello World";
      str = str + "!!!";
      System.out.println(str);
    }
  }

// Strings are placed in the String Pool

// Strings are maintained in a special area of the heap called the String Pool.
// The String Pool is a special area of the heap where all the String objects
// are placed. The String Pool is used to store all the String objects that are
// created using the literal notation. The following example shows how to create
// a String object using the literal notation.

// Comparison of Strings is done using equals method

// For comparing two Strings, String class uses equals() method instead of
// equality operator. String class overrides the equal method and offers content
// equality which basically uses characters, case, and order.

// To full utilize the String class, we need to understand the methods that come
// with a string object. We will take a look at a small example for each of the
// methods below:

toUpperCase() - Converts a string to upper case letters
toLowerCase() - Converts a string to lower case letters

charAt(int index) - Returns the character at the specified index (position)

concat(String s) - Concatenates a specified string to the end of the string

equals(String s) - Compares two strings. Returns true if the strings are equal, and false if not

equalsIgnoreCase(String s) - Compares two strings, ignoring case considerations
length() - Returns the length of a specified string

replace(char old, char new) - Searches a string for a specified value, and returns a new string where the specified values are replaced
trim() - Removes whitespace from both ends of a string
