// Hello World

// Hello world is a simple program that prints "Hello World" to the screen. It is a basic was to test our coding environment and testing your basic understanding of syntax.

// To write Hello World in Java, we need to create a class and a main method. The class is the blueprint for the object. The main method is the entry point of the program.

// The main method is a special method that is called by the Java Virtual Machine (JVM) when the program is executed. The main method is the starting point of the program.

// The main method is defined as follows:

public static void main(String[]args)

// The main method is defined as public, which means it can be accessed from anywhere. It is defined as static, which means it can be called without creating an object of the class. It is defined as void, which means it does not return a value.

// The main method is defined as taking an array of String objects as a parameter. This array is called args and is used to pass arguments to the program when it is executed.

// The main method is defined as throwing an exception. An exception is an event, which occurs during the execution of a program that disrupts the normal flow of the program's instructions.

// Now let's do Hello World:

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

// Java: Entities of Java

// Java is made of 3 core elements: classes, objects, and methods.

// Classes: A class is a blueprint for the object. It is a template that
// describes the state and behavior that the objects of its type support.
// Objects in java are meant to represent real world objects. Since most objects
// in the real world have state or behavior, there is a way to represent those
// in java classes as well. Any line of code that you write in java has to be
// within a class since java is an object oriented language.

class Dog {

}

// in the above syntax, we created a class called Dog. The open curly brace
// represents the beginning of class Dog and the closing curly brace represents
// the end of class Dog. Any code within those two curly braces is considered to
// be "within" class Dog.

// State and Behavior

// We stated in the previous section that objects can have state and behavior.
// This means that we need a way to define these attributes with a class.

// How do we represent State?

// When we talk about objects having state, this refers to a constuct called
// variables. A variable is a way to store data within code. Let's give our Dog
// class a variable called age.

class Dog {
    int age;
}

// In the above syntax, we created a variable called age. The variable is of
// type int, which means it can store integers. The variable is defined within
// the class Dog. This means that the variable is available to all objects of
// type Dog.

// How do we represent Behavior?

// When we talk about objects having behavior, this refers to a construct called
// methods. A method is a block of code that we can invoke again and again.
// Methods in java usually represent some sort of action. Since dogs bark:

class Dog {
    int age;

    void bark() {
        System.out.println("Woof!");
    }
}

// We can identify what a method looks like by its syntax. Methods always have
// parenthesis after the method name. No other construct in java does this. In
// the above example, the method name is bark which then has the parenthesis
// followed by curly braces which represents the opening and closing of the
// method. the datatype String before the method name represerents what datatype
// we are expecting to return from this method. Note: If your method does not
// return anything, you can use the keyword void instead of a datatype.

// What is the point?

// The point of classes are to provide a blueprint so that we can reuse code in
// our programs. We can create as many objects as we want from a class. Let's
// create a Dog object.

class Dog {
    int age;

    void bark() {
        System.out.println("Woof!");
    }
}

Dog max = new Dog();

// In the above syntax, we created a Dog object called max. And since we defined
// a beahvior for our Dog class, we can invoke the bark method on the max
// object.

Sting dogBarking = max.bark();
