# File Handling

File handling in Java involves performing operations on files and directories, such as reading from or writing to files, creating new files, deleting files, and more. Java provides several classes and interfaces in its standard library (java.io) to support file handling operations.

The File class represents a file or directory pathname. It doesn't directly provide methods for file operations but provides methods to retrieve information about files and directories, such as checking if a file exists, getting the file's name, checking if it's a directory, etc.

``` java
File file = new File("example.txt");
if (file.exists()) {
    // File exists, do something
} else {
    // File doesn't exist, handle accordingly
}

```

```java
import java.io.File;  // Import the File class

File myObj = new File("filename.txt"); // Specify the filename
```
File operations:
- create a file
- get file information
- read a file
- write a file
- delete a file
