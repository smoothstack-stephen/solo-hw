# Lessons Learned

## Day 1 (July 30)
#### *Printing triangles*
1. Avoid static class methods and inner classes if possible.
    * Instead, create an instance of the outer class in order to access those methods and inner classes.
```java
public class OuterClass {
  class InnerClass {...}
  
  public static void main(String[] args) {
    OuterClass outer = new OuterClass();
    InnerClass inner = outer.new InnerClass();
    
    // Alternate method
    InnerClass inner = new OuterClass().new InnerClass();
   }
}
```
2. Strive to make the codebase as succinct and easily readable as possible.


## Day 2 (July 31)
#### *Command-line input, 2D arrays, inheritance practice*
1. Use descriptive names for variables for improved code readability.
    * Exceptions: meaningless variables, such as simple loop counters
2. Make sure to start a git push from a clean repo (to avoid unnecessary conflicts).    
    
## Day 3 (August 1)
#### *File IO practice*
1. Use the **append** parameter to append text to a file.
```java
// Default constructor "FileWriter(File file)" leads to overwriting existing text!
FileWriter(File file, boolean append)
```
2. You can assign a value to a variable within a conditional check (if the variable has already been created)!
```java
Scanner scan = new Scanner(System.in);
String line;

// A value is assigned to the variable line in the conditional check
while ( (line = scan.nextLine()) != null ) { ... }
```
