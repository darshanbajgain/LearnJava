## Exception:
    Exception is an abnormal condition.

    In Java, an exception is an event that disrupts the normal flow of the program.

#### Categories of Exceptions:

1. Checked Exceptions:
    - Occurs at compile time of a program.
    - Raised due to user error.
    - IOException, ClassNotFoundException, SQLException etc.

2. Unchecked Exception:
    - Occurs at run time of a program, ingored at compile time.
    - Raised due to Logical Programming Error.
    - ArithmeticException, ArrayIndexOutOfBoundException etc.

3. Errors:
    - Arises beyond the control of user or the programmer.
    - Hardware failures, JVM crash, OutOfMemoryError etc.

## Exception Handling:
    Exception Handling is the method to handling exception. It is a mechanism to handle runtime erros to maintain the normal flow of a program.

In Java Exception handling can be done by using *try, catch, throw, throws, and finally keywords*.

try - is used to specify the block where exception can occur. It wraps the code section that might throw exception.

catch - is used to handle the exception. Catch block must follow try block, a single try block can have multiple catch blocks. Catch is followed by finally.

finally - contains all the curical statements that must be executed whether exceptions occur or not.

throw - is used to throw exception explictly (clearly & direct way).

throws - is used in method declaration to indicate that method might throw certian types of exceptions.

# UserDefined Exception

    We can create our own exception type in java. We can create a custom excpetion in java by extending either Exception class or RuntimeException Class.

Syntax:

```java

    class CustomExceptionName extends Exception
    {
        // Implementation 
    }

```

