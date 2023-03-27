// Java String Basics

// Learning Objectives for the String Basics topic

// Discuss the String Class

// Successfully execute a Java program that demonstrates different operations on Strings using the String API

// Strings are a commonly used reference type in java to hold multiple characters

// In Java, Strings are not primitives, they are immutable, constant objects derived from the String class. To be immutable means that they state or value of the object cannot be altered once created - this is accomplished by having internal, private and final fields and not implementing any "setter" methods which would  alter th state of those fields

// Because Strings are immutable, all of the methods in the String class return a new String - the original is not modified. For Example:

String str1 = "my string";
str1.concat(" is cool");

System.out.println(str1); // prints "my string"

// This is because the .concat returns a completely new string that we have not assigned to any variable, and the original object is immutable and cannot be changed

// thus, str1 still refers to the String "my string". In order to make the code print "my string is cool", we need to change line 2:

str1 = str1.concat(" is cool");

// which reassigns the reference variable str1 to a new String returned from the method (the original String has not changed, however).

// Unique properties of Strings in Java

// Strings are crucial in Java and also are frequently used by Java programmers. It is important that the Java developers have a good knowledge about the String class and its methods. The String class is immutable, which means that once a String object is created, it cannot be changed. The String class has a lot of methods that can be used to perform operations on Strings. The String class is a final class, which means that it cannot be inherited. The String class implements the Serializable and Comparable interfaces.