# Externalization in Java

Externalization is a mechanism in Java that allows you to have more control over the serialization and deserialization process compared to the default Java serialization. It's an interface defined in the `java.io` package and gives developers the ability to define how an object is serialized and deserialized.
Externalization in Java is a process that improves the performance of serialization and deserialization mechanisms by complete control over what data fields are serialized and deserialized.
In other simple words, externalization is used to customize serialization and deserialization processes. It provides complete control over the serialization and deserialization tasks.
Java supports the externalization process by the externalizable interface.
Implementing the Externalizable interface by a class provides more control in reading and writing objects from/to a stream.
The main advantage of externalization over the serialization process is that everything is taken care of by the programmer. JVM has no control over it. The complete serialization control goes to the application.

[//]: # ( Important methods and interfaces.)

1. **Externalizable Interface**: To use externalization, a class must implement the `java.io.Externalizable` interface. This interface extends the `Serializable` interface and adds two methods: `writeExternal` for serialization and `readExternal` for deserialization.
2. **void readExternal(ObjectInput inStream):** The `readExternal()` method restores the calling object’s contents by calling various methods on the specified ObjectInput in. In other simple words, we call `readExternal()` method when we want to read an object’s fields from a stream. We need to write logic to read an object’s fields inside the `readExternal()` method.
3. void writeExternal(ObjectOutput outStream): The `writeExternal()` method saves the calling object’s contents by calling various methods on the specified ObjectOutput outStream. In simple words, `writeExternal()` method is used when we want to write an object’s fields to a stream. We need to write the logic to write data fields inside `writeExternal()` method.

```java
   public class MyClass implements Externalizable {
       // Implement writeExternal and readExternal methods
       // ...
   }
```
## How it's done in java :
  - In the serialization process, JVM first checks for Externalizable interface. If objects support Externalizable interface, JVM serializes objects using writeExternal() method.

  - If objects do not support Externalizable but implement Serializable, objects are stored using ObjectOutputStream.

  - For serializable objects, JVM serializes the only instance variables that are not declared with the transient keyword.

  - For externalizable objects, we have full control over what pieces of data have to serialize and what to not serialize.



## Difference between Serializable and Externalizable in Java :

The difference between serializable and externalizable in java are as follows:
1. Serializable is a marker interface whereas, Externalizable is not a marker interface. It provides two methods: writeExternal() and readExternal().

2. In the case of Serializable, default serialization process is used. While, in the case of Externalization, custom serialization process is used that is implemented by the application.

3. In the serialization process, everything is taken care of by JVM and the programmer doesn’t have any control. While in the case of externalization process, everything is taken care of by the programmer and JVM doesn’t have any control.

4. Externalizable interface is generally used when we want to store the output data in custom format that is different from java default serialization format like csv, database, flat file, XML, etc.

5. In externalization process, readExternal() and writeExternal() methods are used to perform serialization.

6. Externalizable interface can improve the performance of serialization process if used correctly.