// Java: Variable Scope

// Learning Objectives for Variable Scope:

// Define Variable Scope

// List and discuss the different types of variable scope

// Successfully execute a Java program that demonstrates the different levels of
// variable scope

// What is Variable Scope?

// When a variable is declared in a Java program, it is attached to a specific
// scope within the program, which determines where the variable resides. The
// different scopes of a variable are:

// Instance, or object, scope
// Class, or static, scope
// Method scope
// Block scope

// Instance scope means that the variable is attached to individual objects
// created from the class. WHen an instance-scoped variable is modified, it has
// no effect on other, distinct objects of the same class.

// Class scoped variables reside on the class definition itself. This means that
// when objects update a class-scoped variable, the change is reflected across
// all instances of the class. Class scope is declared with the static keyword.
// Methods can also be declared as class scope. However, static methods cannot
// invoke instance methods or variables because there is not a specific object
// to reference. Static methods and variables