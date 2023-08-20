## Template pattern

This pattern allow us to define the structure of an algorithm in a superclass while allow us to override specific steps from that algorithm without changing the overall structure.
The template pattern is very useful when you have a common algorithm or process that It's execute across different classes but certain steps can vary based on specific requirements.

    - Identify common algorithm or process across classes.
    - Create base abstract class and define abstract methods for the steps of the algorithm.
    - Create a template method that defines the sequence of steps in the algorithm. 
    - Extend base class in subclass and override abstract methods if necesary.
    - Client should use instance of subclasses and call the template method.
