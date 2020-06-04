## W3 Notes

**Abstract class and Interfaces**


Abstract class = `public abstract class` can have members variable that cand be inhrited.
can have cunstructor and methods can be `public`, `private` etc.
An abstract class is a class that is declared abstract—it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.

Interface = `public interface class` can have variables but they are basicly static `public static final` an are basicly constant values that can never change, interfaces cant not be instantiated they are `Implemented`.

Abstract classes are similar to interfaces. You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation. However, with abstract classes, you can declare fields that are not static and final, and define public, protected, and private concrete methods. With interfaces, all fields are automatically public, static, and final, and all methods that you declare or define (as default methods) are public. In addition, you can extend only one class, whether or not it is abstract, whereas you can implement any number of interfaces.

Which should you use, abstract classes or interfaces?

Consider using abstract classes if any of these statements apply to your situation:
You want to share code among several closely related classes.
You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.
Consider using interfaces if any of these statements apply to your situation:
You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
You want to take advantage of multiple inheritance of type.

**Quiz 2 Points**
`throw` = use for creating an exception explicitly whatever i want.

![throwEX.PNG](:/832094b4a3cb4f49a06deee5ad7511be)

`throws` = the code can have some Exceptions but it dose not handel the exception. if a declare a method `throws IOExeptions` even if is a try and catch method inside the method is not the job of that try and catch to handle that exception.

![throwsEX.PNG](:/a24862ac72254b1eb1ce8ebc3f05f4e6)