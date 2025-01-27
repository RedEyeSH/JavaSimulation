1.3 - Task 03

In Java, a Singleton ensures that a class has only one instance. 
The reason you can't create a Singleton object using new from outside the class is because the constructor is private. 
This prevents other classes from creating new instances. 
Instead, the Singleton class provides a static method (like getInstance()) to control the creation and ensure that only one instance is ever used. 
This guarantees that the Singleton pattern works as intended, maintaining just one instance throughout the application.