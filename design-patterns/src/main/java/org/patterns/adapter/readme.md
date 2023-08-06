## Adapter pattern

An Adapter pattern acts as a connector between two incompatible interfaces. This pattern allow us to convert an existing interface into another one.

    - Identify the existing components with different interfaces that you need to make work together.
    - Create an interface that represents the methods your application needs to use.  This is your "Target" interface.
    - For each incompatible class, create an adapter class that implements the target interface. This adapter class will adapt the methods and behavior of the incompatible class to fit the target interface.
    - Inside the adapter class, implement the methods from the target interface. In these methods, call the methods of the incompatible class and perform any necessary conversions or adaptations to make the data compatible with the target interface.
    - In your application code, use the adapter class to interact with the incompatible class through the target interface. 

