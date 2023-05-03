// Java Flow Control Statements
[[
// Learning Objectives for Flow Control Statements

//Explain how if, else, and else if are used with boolean expressions to provide alternate paths for Java program execution

// Explain how switch and case are used to provide an alternative to a chain of else if statements

//Debug, compile, and successfully execute a Java program that demonstrates both if and switch branching structures

// Justify the need for loops in programming

//Compare and contrast the different looping structures in Java

// Define break, continue, and labels

// Debug, compile, and successfully execute a Java program that demonstrates break, continue, and labels for flow control

// Up to this point, the Java code we have written has run straight through from beginning to end without and "deliniations". 

// Here are two ways of writing Java statements that create variability in Java programs:

// The if statement lets us execute a statement only if some conditional test turns out to be true

// The switch statement lets us execute one of several blocks of statements depending on the value of a variable of certain types. Not all data types can be used with a switch statement

// if statements

  // The if statement depends on the use of boolean expressions

  // A Boolean expression is an expression that returns a simple true or false result

  // A statement or block of statements is executed should the result of the Boolean expression is true

  // else and else if statements provide alternate routes for program execution to follow should the result of the Boolean expression be false.
  
// Boolean expressions can be complicated; however frequently they involve the comparison of the value of one variable or another, which could be another variable, a literal, or even an arithmatic expression. This comparison uses one of the relational operators listed below. All of these operators are binary operators which means they work on two operands, one to the left of the relational operator and one to the right of the relational operator.

// OperatorDescription

== // Returns true if the expression on the left evaluates to the same value as the one on the right

!= // Returns true if the expression on the left does not evaluate to be the same as the one on the right

< // Returns true if the expression on the left evaluates to be less than the one on the right

> // Returns true if the expression on the left evaluates to be greater than the one on the right

<= // Returns true if the expression on the left evaluates to be less than or equal to the one on the right

>= // Returns true if the expression on the left evaluates to be greater than or equal to the one on the right

// The basic syntax of an if statement is as follows: 

if (boolean expression) {
  // statement or block of statements to be executed if the boolean expression is true
} else if (boolean expression) {
  // statement or block of statements to be executed if the boolean expression is true
} else {
  // statement or block of statements to be executed if the boolean expression is false
}

// Switch statements

// Many applications call for a simple logical selection of things to be done depending on some value that controls everything.

// Sometimes this is handled with large chains of elseif statements, which can get quickly out of hand. 

// Thw switch statement provides a more elegant solution

// switch statements attempt to match some variable with the value it contains

// This type of statement works with byte, short, char, and int primitives, along with enumerated types (enums) and - since Java 7 - String objects. 

// The basic syntax of a switch statement is as follows: 

 switch(variable) {
  case 'A': System.out.println("Case A matches!"); break;
  case 'B': System.out.println("Case B matches!"); break;
  case 'C': System.out.println("Case C matches!"); break;
  default: System.out.println("No case matches!"); break;

}

// Control Flow Statements

//Now we look at Java statements that allow for the repeated execution of the same statement or block of statements. these are known as loops. Loops are eky for writing on of the most common types of programs- programs that get input from the user, provess the output, then get more input from the user and so on. 

// Just like if statements, loops rely on conditional expressions to tell them when to stop looping. Otherwise, loops would continue without end. 

// The following are the Java keywords used to create a variety of loops, depending on the looping situation required:

for // A for loop is used to execute a statement or block of statements a specified number of times
while // A while loop is used to execute a statement or block of statements as long as a specified condition is true
do-while // A do-while loop is used to execute a statement or block of statements as long as a specified condition is true

// For loops are used for iteration, often in conjunction with data structures. They include 3 statements in parentheses - a declaration, condition, and statement (typically increment or decrement).

// The basic syntax of a for loop is as follows:

for (int=0; i < myData.length; i++) {
  // statement or block of statements to be executed
  System.out.println(myData[i]);
}

//Any object which implements the Iterable interface can be iterated over using an enhanced for-loop. The syntax is given in an example:

List<String> myList = getListOfStrings();
for (String myStr : listOfStrings) {
  System.out.pringln(myStr);
}

// While statements

// While statements are used to execute a statement or block of statements as long as a specified condition is true, otherwise the block is skipped. 

// The block is looped through as long as the condition remains true.

// The basic syntax of a while loop is as follows:

while (boolean expression) {
  // statement or block of statements to be executed
}

// Do-while statements

// do while statements are used as an alternative to while. The difference is that the block of statements is executed at least once, even if the condition is false.

// The basic syntax of a do-while loop is as follows:

do {
  // statement or block of statements to be executed
} while (boolean expression); // The condition is evaluated after the block of statements is executed

// Overview of break and continue

//A program generally is a linear flow of execution of consecutive statements

// The programmer imposes certain controls to redirect the flow in an appropriate direction based upon some logic. There are different ways to control the flow of execution of a program.

// The statements written using those keywords are called control flow statements

// Java's break and continue statements are examples of control statements

// The break statement is used to terminate a loop or a switch statement

// The continue statement is used to skip the current iteration of a loop