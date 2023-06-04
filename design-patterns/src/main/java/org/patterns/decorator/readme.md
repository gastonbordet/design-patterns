## Decorator pattern

The Decorator design pattern is useful when you want to dynamically add behavior or modify the functionality of an object without changing its underlying structure. It allows you to extend the functionality of an object at runtime by wrapping it with additional objects, also known as decorators.

To implement the Decorator pattern, you typically follow these steps:

    - Create an interface or abstract class that defines the common interface for both the core object and its decorators.
    - Implement the core object class that provides the basic functionality.
    - Create decorator classes that implement the same interface or extend the abstract class from step 1.
    - Each decorator contains a reference to the wrapped object and provides additional behavior by intercepting method calls and adding extra functionality before or after delegating to the wrapped object.
    - Decorators can be stacked by wrapping a decorated object with another decorator.
    - The client code interacts with the object through the interface, unaware of the decorators' presence.

