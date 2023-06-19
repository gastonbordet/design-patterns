## Singleton pattern

The Singleton design pattern is used when you want to ensure that only one instance of a class is created and that there is a global point of access to that instance throughout the program. It is commonly used in situations where you need a single shared resource or when you want to control the access to a resource to avoid conflicts.

To implement it follow these steps:

    - Create a class that will be the Singleton. Make sure the class has a private constructor to prevent direct instantiation.
    - Inside the class, declare a private static variable that will hold the single instance of the class. This variable will be accessed globally.
    - Create a public static method that provides access to the Singleton instance.
    - (Eager) If you want to delay the creation of the instance until it is first accessed.
        - This method will check if the instance already exists and return it, or create a new instance if it doesn't.
    - (Lazy) If you want to create the instance inmediately
        - The method should return the instance already initialized from the property declaration
    - Throughout your code, use the static method to access the Singleton instance and perform operations on it. This ensures that all parts of your code interact with the same instance.
