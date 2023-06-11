## Factory design patter

The Factory design pattern is a creational design pattern that provides an interface for creating objects without
specifying their exact classes. It encapsulates the object creation logic within a separate method or class, known as
the factory, which is responsible for creating instances of various related classes.

Here's a step-by-step guide to implementing the Factory design pattern:

    - Define the common interface: Create an abstract class or interface that defines the common methods or properties that all the products will have.
    - Create concrete classes that implement the common interface defined in the previous step.
    - Design a factory class responsible for creating instances of the products. The factory class should have factory methods or a single method that takes parameters to determine the type of object to create.
    - In the factory class, implement the factory methods or a single method that handles the object creation logic.
    - In your client code, use the factory class to create instances of the desired objects.
    - If you need to add new product types in the future, you can create additional concrete classes that implement the common interface. Modify the factory class to include the logic for creating these new product types. 