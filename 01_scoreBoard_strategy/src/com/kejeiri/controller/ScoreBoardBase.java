package com.kejeiri.controller;

/*
    We could go also for an interface instead of an abstract class
    we should be implemented at Balloon, SquareBalloon & Clown classes
                         ----------------------------
                         Interface VS Abstract class.
                         ----------------------------
    - Methods of a Java interface are implicitly abstract and cannot have implementations.
    - Java abstract class can have instance methods that implements a default behaviour.
    - Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
    - Members of a Java interface are public by default. A Java abstract class can have the usual flavours of class
      members like private, protected, etc.
    - A Java interface should be implemented using keyword “implements”; A Java abstract class should be extended using
    keyword “extends”. An interface can extend another Java interface only, an abstract class can extend another
    Java class and implement multiple Java interfaces.A Java class can implement multiple interfaces but it
    can extend only one abstract class.
    - abstract classes have constructors, even though you cannot instantiate an abstract class, the constructors is used by child classes.
    - Interfaces indicate "what" but not "how" because they define a contract (list of methods) while  abstract class can also indicate
     "how" (implement a method).
    - Using Interface you can emulate multiple inheritance (a class can implement multiple Interfaces but only extend one class).
    - Using Interface you can have a base type for different families such as:
            Flyer f=new Plane();Flyer f2=new Bird(); Bird and Plane don't correspond to the same familiy but both can fly (are flyers).

    - Interfaces are rules (rules because you must give an implementation to them that you can't ignore or avoid, so that they are imposed
      like rules) which works as a common understanding document among various teams in software development.
    - Interfaces give the idea what is to be done but not how it will be done. So implementation completely depends
      on developer by following the given rules (means given signature of methods).
    - Abstract classes may contain abstract declarations, concrete implementations, or both.
    - Abstract declarations are like rules to be followed and concrete implementations are like guidelines
      (you can use it as it is or you can ignore it by overriding and giving your own implementation to it).
    - Moreover which methods with same signature may change the behaviour in different context are provided as
     interface declarations as rules to implement accordingly in different contexts.
    - Methods of a Java interface are implicitly abstract and cannot have implementations
    - An interface is a reference type, similar to a class, that can contain only constants, method signatures,
    default methods, static methods,and nested types Method bodies exist only for default methods and static methods.
    - Default methods enable you to add new functionality to the interfaces of your libraries and ensure binary
      compatibility with code written for older versions of those interfaces.
    - use Interface:
        To define a contract ( preferably stateless - I mean no variables )
        To link unrelated classes with has a capabilities.
        To declare public constant variables (immutable state)

    - use Abstract class:
        Share code among several closely related classes. It establishes a relation.
        Share common state among related classes (state can be modified in concrete classes)
    - Unrelated classes can have capabilities through interface but related classes change the behaviour through extension of base classes.
    - Consider using abstract classes if :
	- You want to share code among several closely related classes.
	- You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
	- You want to declare non-static or non-final fields.

    - Consider using interfaces if :
        - You expect that unrelated classes would implement your interface. For example,many unrelated objects can implement Serializable interface.
        - You want to specify the behaviour of a particular data type, but not concerned about who implements its behaviour.
        - You want to take advantage of multiple inheritance of type.

    - In simple terms, I would like to use :
        interface: To implement a contract by multiple unrelated objects
        abstract class: To implement the same or different behaviour among multiple related objects
*/
public abstract class ScoreBoardBase {
    public abstract int calculateScore(int taps, int multiplier);
}
