package com.Practice.InnerClasses.Session;

public class Notes {
}
/*

************************************** NESTED CLASSES & TYPES  ****************************************

--->A class declared inside another class is known as nested classes in java.
The scope of a nested class is tied by the scope of its enclosing class(outer class).

--->A nested class in java has access to the members ( including private members) of its enclosing class.

--->But, the enclosing class does not have access to the members of the nested class.

--->The class which is a member of another class can be either static or non-static.
In other words, there are two types of nested classes in java: static and non-static classes.

--->The member class which is declared with a static modifier is known as static nested class in java.

--->The member class which is non-static is known as inner class or non-static nested class.


**************************************** NESTED CLASSES ****************************************


--->When an inner class is defined with a static modifier inside the body of another class, it is known as a static nested class in Java.

--->Since it is a static nested class, we do not need an instance of its outer class to create its object.
An object of class Outer and an object of class Nested can exist independently because
both are top-level classes.

--->The class itself cannot be really ‘static’. There is no such thing as a static class in Java.
A class can be static if it is a nested class.

--->Outer.Nested n = new Outer.Nested();//To access deep inner or nested class
--->Nested n=new Nested();

--->We can declare the main method inside a static nested class.
A static nested class can have both static and non-static members including the main method.

--->A static nested class cannot access non-static members of its outer class because
it does not have an implicit reference to an outer object.

--->An instance of a static nested class is created the same way as you create an instance
of a top-level class using the new keyword.

--->The declaration of the members of an inner class shadow those of the enclosing class
if they have the same name.

--->In 'this' case, the 'this' keyword refers to the instances of the nested class and the members of the outer class
can be referred to using the name of the outer class.

--->First we need to understand that static keyword can only be applied to a nested class and
not to outer class.

--->If we make anything final then it becomes constant, something that is final value and cannot be changed.

--->If a class is final then it simply means it cannot be inherited.

--->So if we mark a nested class (static or non-static) final then it cannot be inherited.

--->Static Nested Class can't access enclosing class instance and invoke
methods on it, so should be used when the nested class doesn't require access to an instance of
the enclosing class.

--->A common use of static nested class is to implement a components of the outer object.


*************************************** INNER CLASSES ****************************************


--->An inner class in java is a class that is declared inside another class without static modifier.
It is also commonly known as a non-static nested class in Java.It can access all
members (variables and methods) of its outer class.

--->The relationship between outer class and inner class represents Has-A relationship.
A Has-A relationship establishes the relationship between two classes.
It is also known as composition or aggregation in Java.

--->When an inner class is an enclosing class for another inner class, it is called nesting of inner classes.
There is no limit to the nesting of inner classes.

--->Java compiler generates a separate dot class file for each inner class
named Outer$Inner.class and for an outer class named Outer.class .

--->If any dot class file name contains “$” symbol in its middle, it shows an innerclass file.
The format of the class files for inner classes has the same as class files for the outer classes.

--->An inner class can have the same name as the outer class.
The scope of inner class is bounded by the scope of its outer class.
Without existing an outer class object or instance, there will be no chance of an existing inner class object.

--->An inner class can directly access all the variables and methods of the outer class including private.
Since the inner class is a regular member of the outer class just like declared variables and methods
in the class. That’s why, we can apply all java access modifiers such as public, default,protected,
and private to inner class similar to the other members of a class.

--->If the variable name of inner class is the same as the variable name of outer class,
we can access the outer class variable like this.OuterClassName.this.VariableName;
here this represents current outer class object.

--->Java inner class is hidden from another class in its enclosing class. 
Therefore, it provides a safety mechanism in the application program and decreases readability (understanding) of the program.

--->An object of inner class is often created in its outer class and cannot be created from other classes. 
Both outer class and inner class objects are created in separate memory locations.
 
--->OuterClass.InnerClass innerObject = outerObject.new InnerClass();
 
 --->The best use of java inner class is when its functionality is tied to its outer class. 
That is, without an existing outer class object, there is no chance of existing inner class object.
 
--->We cannot have the main method in the inner class because it is static.
 
 --->Nonstatic Nested class is implicitly associated with the enclosing instance of the containing class, 
 this means that it is possible to invoke methods and access variables of the enclosing instance.
 
 **************************************** LOCAL CLASSES ****************************************
 
 --->An inner class that is declared inside a method of the outer class is called method local inner class 
 in Java. Its scope is limited to the block of a method in which it is declared.
 
--->Therefore, the declaration of method local inner class cannot use any access modifiers such as public, 
protected, private, and non-access modifiers such as static.
 
--->Method local inner class in Java can also be declared inside the constructor,static initializers, 
 and non-static initializers.
 
--->The only applicable keywords for the method local inner class are final,abstract, and strictfp.
 
--->A local inner class is called when that method is called. It cannot be instantiated from outside 
the block of the method where it is created.
 
--->The purpose or need of a method local inner class in Java is to define a specific method whose 
functionality is required repeatedly.

--->A method-local inner class is the best suitable to meet nested-method requirements.

--->If you declare inner class directly inside an instance method, you can directly access both 
static and non-static members from the method local inner class.
 
--->A method local inner class cannot access the local variables of method in which it is declared 
because the local variables in a method exist only during the execution of that method.

--->In Java SE 8, a local class can access local variables and parameters of the enclosing block that are final or effectively final. 

--->A variable or parameter whose value is never changed after it is initialized is effectively final.
 
--->Declarations of a type (such as a variable) in a local class shadow declarations in the enclosing 
scope that have the same name.
 
--->Local classes are non-static because they have access to instance members of the enclosing block. 
Consequently, they cannot contain most kinds of static declarations.

--->You cannot declare an interface inside a block; interfaces are inherently static.

--->You cannot declare static initializers or member interfaces in a local class.

--->A local class can have static members provided that they are constant variables(static+final).

--->If a declaration of a member in inner class has the same name as that in the outer class, 
then inner declaration shadows outer declaration in enclosing scope.
 
*************************************** ANONYMOUS CLASSES ****************************************

--->An anonymous inner class in Java is an inner class which is declared without any class name at all.
In simple words, a nameless inner class is called anonymous inner class.

--->Java anonymous inner classes are useful when we need only one object of the class.
Since an anonymous inner class does not have a name, it cannot have a constructor.

--->The new keyword is used to create an object of the anonymous inner class.
It is always followed by either an existing class name or an existing interface name.

--->If a class name is used, it means that the anonymous class extends from that class.

--->Inside an anonymous class body, we can define variables, methods (if necessary), instance block, and local class.

--->An anonymous inner class is useful when you are writing implementation classes for listener interfaces
in graphics programming.

--->An anonymous inner class is the best suitable for GUI based applications to implement event handling.

--->An anonymous inner class cannot have an explicit extends or implements clause.

--->It must implement all the abstract methods defined within a superclass or of the interface.
Internally, it always uses a default constructor from its superclass to create an object.

--->Like the local inner class, an anonymous inner class can also access the members of its outer class.

--->A normal Java class can extend a class and can implement any number of interfaces simultaneously but
an anonymous inner class can extend a class or can implement an interface but not both simultaneously.

--->They are like local classes except that they do not have a name. Use them if you need to use a local class only once.
 
--->While local classes are class declarations, anonymous classes are expressions, which means that
you define the class in another expression.

--->The syntax of an anonymous class expression is like the invocation of a constructor, except that there is a class
definition contained in a block of code.

--->The anonymous class expression consists of the following:
-->The new operator
-->The name of an interface to implement or a class to extend.
-->Parentheses that contain the arguments to a constructor, just like a normal class instance creation expression.
Note: When you implement an interface, there is no constructor, so you use an empty pair of parentheses.
--->A body, which is a class declaration body.
--->More specifically, in the body, method declarations are allowed but statements are not.
--->Because an anonymous class definition is an expression, it must be part of a statement.
(This explains why there is a semicolon after the closing brace.)
 
--->new ParentClass(){};
->ParentClass = class to extend
-->() = Just Constructor parameters
-->{} = Method Declarations

-->new InterfaceName(){};
->InterfaceName = Interface to implement
->{} = Method Implementations

--->There will be exactly one instance for anonymous class. So they can't be abstract.
 
--->An anonymous class must always implement an interface or extend an abstract class.

--->Anonymous classes also have the same restrictions as local classes.

--->Note that you can declare the following in anonymous classes:
Fields,Extra methods (even if they do not implement any methods of the supertype),
Instance blocks, Local classes, and cannot declare constructors in an anonymous class.

 */