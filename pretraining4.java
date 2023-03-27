// Java: Flow control statements

// Learning Objectives for the Flow Control Statements topic

// Explain how if, else, and else if are used with Boolean expressions to provide alternate paths for Java program execution
// Explain how switch and case are used to provide an alternative to a chain of else if statements
// Debug, compile, and successfully execute a Java program that demonstrates both if and switch branching structures
// Justify the need for loops in programming
// Compare and contrast the different looping structure in Java
// Define break, continue, and labels
// Debug, compile, and successfully execute a Java program that demonstrates the use of break, continue, and labels for flow control

/// The if statement lets us execute a statement or a block of statements only if some conditional test turns out to be true

// The switch statement lets us execute one of several blocks of statements depending on the value of a variable of certain types. Not all data types can be used with a switch statement

// If statements

// The if statement depends on the use of Boolean expressions

// A Boolean expression is an expression that returns a simple true or false result

// A statement or block of statements is executed should the result of the Boolean expression be true

// else and else if statements provide alternate paths for Java program execution

// Boolean expressions can be complicated; however, frequently they involve the comparison of the value of two variables or other holders of value (literal or arithmetic expression, for example). This comparison uses one of the relational operators: ==, !=, <, >, <=, >=, and the logical operators: &&, ||, and !. The result of a relational or logical expression is a Boolean value

// the basic syntax of an if statement is:

if (condition) {
  statement1;
} else if (condition) {
  statement2;
} else {
  statement3;
}

// Switch statements

// Many applications call for a simple logical selection of things to be done depending on some value that controls everything

// Sometimes this is handled with large chains of else-if statements, which is clunky and gets out of hand quickly

// The switch statement is a more elegant way to handle this type of situation

// switch statements attempt to match some variable with the value it contains

// This type of statement works with byte, short, char, and int primitives, along with enumerated types, String, and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer

// The basic syntax of a switch statement is:

switch (expression) {
  case value1:
    statement1;
    break;
  case value2:
    statement2;
    break;
  case value3:
    statement3;
    break;
  default:
    statement4;
}

// Control FLow Statements

// Now we look at Java statements that allow for the repeated execution of the same statement or block of statements. These are known as loops. 

// Loops are key for writing one of the most common types of programs- programs with user input, which is then processed as an output, which generates more inputs from the use and so on

// Just like if statements, loops rely on conditional expressions to tell them when to stop looping. Otherwise loops would continue without end

// The following are loop keywords: for, while, do-while

// The for loop is the most common loop in Java. It is used to execute a block of statements repeatedly until a particular condition is satisfied. The syntax of the for loop is:

for (initialization; condition; increment/decrement) {
  statement(s);
}

// Any object which implements the Iterable interface can be iterated over using the enhaced for-loop. The syntax is as follows:

for (type var : iterable) {
  statement(s);
}

// The while loop is used to execute a block of statements repeatedly until a particular condition is satisfied. The syntax of the while loop is:

while (condition) {
  statement(s);
}

// The do-while loop is similar to the while loop except that the condition is checked at the end of the loop. The syntax of the do-while loop is:

do {
  statement(s);
} while (condition);
