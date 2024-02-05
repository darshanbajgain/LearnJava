# Packages in java

A Package is a collection of related classes, interface that provides access protection
and namespace management.

Packages are used in Java to prevent naming conflicts, to control access, to make searching
& usage of classe/interfaces, enumerations etc. easier.

A package can be deined as grouping of related types ( classes, interfaces, enumerations, and annotations)
providing access protection and name space management.

While creating package you should chose a name for package and put a package statement with that name at
the top of every source file that contains classes,interfaces etc. types that you want to include in your packages.

```java
package p1;
public class A {
    // code here
}
```

## Two types: Built In Package & User Defined package.

1. **Built-in Package:**
    Built-in package are existing java packages that comes along with JDK.
    - *import java.util.Scanner;*

2. **UserDefined Package:**
    Defined by the user. It contains userdefined classes and interfaces.
    Java supports a keyword "package" which is used to create userdefined packages in java programming.
    - *package PackageName;*

    In this directory we have created a packaage folder named 'Add' and it has
    class AddOperation.java, and outside the Add folder we have Result.java
    - The Result.java is compiled and run, the Result Class *import Add.AddOPeration;*
