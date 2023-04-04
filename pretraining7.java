// Java: Packages and Imports

// Learning Objectives:

// Describe the concept of packages in Java
// Describe how packages are imported
// Describe how packages are created

// What is a package? A package is a collection of classes, interfaces, and enums in a hierarchial manner

// Why packages? 
// Packages enable you to keep you classes separate from the classes in the Java API
// Packages allow you to reuse classes in other applications
// Packages allow you to distribute your classes to others

// Example:
package com.revature.mypackage;

// This line declares the package in which the class will reside
// This must always be the first (non-commented) line in a .java file
// Packages follow a naming convention of lowercase characters separated by periods in the reverse way you would specify a web domain - thus, com.revature.mypackage instead of mypackage.revature.com
// Also, classes can be referenced anywhere in a program by their "fully qualified name" - which is the package declaration followed by the class, in order to uniquely identify the class.
// Typically we do not want to write out a verbose package and class name together
// Instead, we can use an import statement after our package declaration to pull in other classes
// We can then just use the class name without the package
// By default, everything in the java.lang package is imported
// Other packages an classes must be imported by the programmer explicitly

// Real World Applications Packages and Imports

// Packages store and organize our Java class/interface files
// Usually we separate them into areas of shared functionality
// In our class we declare the package in which our class will reside
// Folders provide a good analogy for packages. Like folders, packages are nested inside eachother

// Packages follow a naming convention of lowercase characters separated by periods in the reverse way you would specify a web domain
// We declare packages in our projects by using the keyword package
// Java packages must correspond to folders in your file system
// When working in most IDEs the folders will be automatically generated as soon as you create a new package
// In this example, we have a HelloWorld project in an IDE workspace with all of the source code stored within the src folder. In this project there is a HelloWorld.java file that includes the following package declaration:

package come.revature.mypackage

// If we were to navigate to that HelloWorld project outside of the IDE we would open the src folder, then the com folder, then the ravature folder

// What happens in the file system if we add another package to the application?

// If more than one package is in an application then the file structure would still correspond to the structure of the packages. If we choose to create a Java class called Driver, in the com.revature package, we would see the other package, mypackage, and the file in the revature folder.

// The package declaration must always be the first non-commented line in a .java file. If you create a package it will showup as the first line of code in all files under that package.

// Java has many built-in packages that can be used that come along with the JDK, The most commonly used package is the java.lang package.

// However, there are also other commonly used ones such as java.util, java.sql, java.security, java.net to name a few.

// Implementation for the Packages and Imports topic

// Example of Importing a Package

//Importing java utility package
import java.util.*;

// Main class

class GFG {

  // Main driver method
  public static void main(String[] args) {

  // Scanner to make input from the user object
  Scanner myObj = new Scanner(System.in);
  String userName;

  // Display message
  // Enter Your Name and Press Enter
  System.out.println("Enter Your Name and Press Enter");

  // Reading the integer age entered using
  // nextInt() method
  userName = myObj.nextLine();

  // Print and display
  System.out.println("Your Name is: " + userName);


}

}

// Creating a Package

// Name of package to be created
package FirstPackage;

class Welcome {
  // main driver method
  public static void main(String[] args) {
    // Print and display
    System.out.println("Welcome to Java");
  }
}

