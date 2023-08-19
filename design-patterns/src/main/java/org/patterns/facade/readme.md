## Facade pattern

The facade patter provides a simplified interface to interact with a complex system of classes or components.
It's used to decouple the client from the underlying complexities of a system.

    - Identify the complex subsystem you want to encapsulate.
    - Create de facade interface that references the classes within the subsystem.
    - Implement facade methods to interact and delegate with calls to the appropiate methods.
    - Call the facade from the client and interact with it.