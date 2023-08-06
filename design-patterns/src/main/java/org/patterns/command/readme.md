## Command pattern

The Command design pattern is useful when you want to encapsulate a request as an object. It can be particularly useful when you want to decouple the sender and receiver of a request, enable undo/redo functionality, or implement logging and auditing of user actions. 

To implement the Decorator pattern, you typically follow these steps:

    - Identify the actions or tasks in your web application that can be encapsulated as commands.
    - For each action, create a separate command class. These classes should implement a common interface or extend a base class that includes an execute method.
    - Create receiver classes that perform the actual operations corresponding to each command.
    - Design an invoker class that will manage a queue of commands.
    - In your web application's client code (such as event handlers or controllers), create instances of command classes and configure them with the necessary parameters.
    - Invoke the invoker's method to execute the commands in the queue. The invoker will call the execute method on each command, and each command will, in turn, trigger the corresponding action on the receiver.

