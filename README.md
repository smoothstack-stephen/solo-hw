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
#### *File IO, strings practice*
TBD
