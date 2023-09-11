
# Reflection in java :


## Advantages
  - Java Reflection is a powerful and advanced feature that allows you to inspect and manipulate the structure and behavior of classes, interfaces, methods, fields, and other elements of a Java program at runtime. It provides a way to obtain metadata about classes and objects and perform operations such as:

  - Inspecting Class Information: You can obtain information about a class, such as its name, superclass, implemented interfaces, and constructors.

  - Accessing Fields: Reflection allows you to access and modify fields (variables) of a class, even if they are private or protected.

  - Invoking Methods: You can invoke methods dynamically, including private methods, by using reflection.

  - Creating Objects: You can create new instances of classes dynamically, even if you don't know their types at compile time.

  - Working with Annotations: Reflection is often used to work with annotations in Java, enabling you to retrieve and manipulate annotations at runtime.
## Different usages of Java Reflection :

Get a method's name:
`method.getName();`

Get a method's return type:
`method.getReturnType();`

Invoke a method:
`method.invoke(anyParameters, listedLikeThis);`

If it's private or not accessible, put this before it:
`method.setAccessible(true);`

See if a method has an annotation:
`method.isAnnotationPresent(NameOfAnnotation.class);`

Get an annotation from a method:
`method.getAnnotation(NameOfAnnotation.class);`

Get a method's parameter types:
`method.getParameterTypes();`

Get annotations on a method's parameters:
`method.getParameterAnnotations()`

Get the class that declares this method:
`method.getDeclaringClass();`

Get all exceptions the method declares it can throw:
`method.getExceptionTypes();`


Field usage:
Get the value of a field:
`field.get(objectToGetThisFieldFrom);`

Get the type of  field:
`Field.getType();`

Set the value of a field:
`field.set(objectToSetThisFieldOn, valueToSetTheFieldTo);`

Get the name of a field:
`field.getName();`

See if a field has an annotation:
`field.isAnnotationPresent(NameOfAnnotation.class);`

Get an annotation from a field:
`field.getAnnotation(NameOfAnnotation.class);`

Get the class that declares this field:
`method.getDeclaringClass();
`

Class reflections:
Get a class's name:
`class.getName();`

See if a class has an annotation:
`class.isAnnotationPresent(NameOfAnnotation.class);`

Get an annotation from a class:
`class.getAnnotation(NameOfAnnotation.class);`

Get declared fields:
`class.getDeclaredFields();`

Get all fields, which will include fields declared in parent classes:
`class.getFields();`

Get declared methods:
`class.getDeclaredMethods();`

Get all methods, which will include fields declared in parent classes:
`class.getMethods();`