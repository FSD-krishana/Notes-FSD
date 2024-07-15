# Classes
-  Classes is a user-defined blueprint from which objects are created.
-  It is a logical entity that contains methods and data.
-  It is a template or blueprint that defines the properties and behavior of objects.
-  For example, Student is a class while a particular student named Ravi is an object.
### Properties of Classes
- Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
- Class does not occupy memory.
- Class is a group of variables of different data types and a group of methods.
- A Class in Java can contain :
  1. Data member
  2. Method
  3. Constructor
  4. Nested Class
  5. Interface
- To create a class, you use the keyword **class**. For example, the following code creates a class named Car:
```
  class Car {
  // Methods
  public void drive() {
    System.out.println("The car is driving.");
  }

  public void brake() {
    System.out.println("The car is braking.");
  }

  // Variables
  private int speed;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
```

# Object
- An object in Java is a basic unit of Object-Oriented Programming and represents real-life entities.
- Objects are the instances of a class that are created to use the attributes and methods of a class.
- **Note: When we create an object which is a non primitive data type, it’s always allocated on the heap memory**
- **One classes can have many object and every object have differant memory.**
- Objects are created at runtime from templates, also known as classes. In Java, an object is created using the keyword new.
- Example :
```
  // Create a new Car object
Car BMW = new Car();

// Set the state of the object
BMW.drive();
BMW.setSpeed(50);
BMW.getSpeed();

// Call the methods of the object
myDog.drive();
myDog.break();
```

# Constructor
- A constructor is a block of codes similar to the method. It is called when an instance of the class is created.
- A constructor is a special type of method that is used to initialize attributes of class. 
- At the time of calling constructor, memory for the object is allocated in the memory.
  
- rules while creating constuctor
  1. Constructor name is same as class name.
  2. Constructor don't have datatype and return type.
  3. Constructor is used only for initialization of attributes of the class.
  4. Constructor is called automatically when the object is created.
     
- **Note** whenever constructor parameter name same as class attribute name used **this** keyword.

- There are three types of Constructor
  1. Default Constructor.
  2. Parameterized Constructor.
  3. Copy Constructor.
### Defailt Constructor 
  - A constructor that has no parameters is known as default the constructor.
  - A default constructor is invisible. And if we write a constructor with no arguments, the compiler does not create a default constructor.
  - It is taken out. It is being overloaded and called a parameterized constructor. The default constructor changed into the parameterized constructor. But Parameterized constructor can’t change the default constructor.
  - The default constructor can be implicit or explicit. If we don’t define explicitly, we get an implicit default constructor.
  - If we manually write a constructor, the implicit one is overridded.
### Parameterized Constructor
  - A constructor that has parameters is known as parameterized constructor.
  - If we want to initialize fields of the class with our own values, then use a parameterized constructor.
  - Example :
```
    // Java Program for Parameterized Constructor
import java.io.*;
class Geek {
    // data members of the class.
    String name;
    int id;
    Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}
class GFG {
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        Geek geek1 = new Geek("Avinash", 68);
        System.out.println("GeekName :" + geek1.name
                           + " and GeekId :" + geek1.id);
    }
  }
```

### Copy Constructor
- A copy constructor is a constructor that initializes an object using another object of the same class.
- Implementing a Copy Constructor
 1. A copy constructor takes a single argument: an object of the same class.
 2. Inside the constructor, you copy the values of the fields from the argument object to the new object.
- Example
   - Let's create a class Person with a copy constructor:
```

class Person {
    private String name;
    private int age;

    // Regular constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object using the regular constructor
        Person original = new Person("John", 30);
        System.out.println("Original: " + original);

        // Creating a copy of the original object using the copy constructor
        Person copy = new Person(original);
        System.out.println("Copy: " + copy);

        // Modifying the copy should not affect the original
        copy.setName("Jane");
        copy.setAge(25);

        System.out.println("Modified Copy: " + copy);
        System.out.println("Original (after modifying copy): " + original);
    }
}


```



- Note : - Remember: Does constructor return any value?
```
  There are no “return value” statements in the constructor, but the constructor returns the current class instance.
  We can write ‘return’ inside a constructor.
```


# Oops 4 Pillars
#### 1. Encapsulation :- Security.
#### 2. Inheritance   :- Code Reusability.
#### 3. Abstraction   :-  Show Important Data.
#### 4. Polymorphism  :-  one name many form.
## Encapsulation
- Eapsulation is a fundamental concept in object-oriented programming that refers to the bundling of data(variable) and methods that operate on that data within a single unit, which is called a class in Java.
- The main purpose of encapsulation is to protect the data from being accessed or modified by unauthorized code.
- This is achieved by making the data members of a class private and providing public methods to access and modify them.
  
**Stpes to Achive Encapsulation**
1. declare a variable private.
2. declare the setter and getter to get and set the variable name.

**Advantages**
1. Control Over Data : using getter or setter data.
2. Data Hiding  : using private data.
3. Easy To Test : using different classes.  
  
**For example**  
- consider a class called Car that has two data members: speed and fuel. We can encapsulate these data members by making them private and providing public methods to get and set their values, as shown below:

```
public class Car {
    private int speed;
    private int fuel;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
```
**Here are some of the benefits of encapsulation:**
- It protects the data from being accessed or modified by unauthorized code.
- It improves the readability and maintainability of code.
- It helps to reduce the coupling between classes.
- It makes it easier to reuse code.
- It makes it easier to debug code.

package Oops;


class personalDetails {

    String name;
    private int password;
    int age;

    personalDetails(String name, int password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    void setAge(int age1){
        if (age1 >= 18 && age1 < 100)
                age = age1;
        else
            age = -1;
    }

    int getAge(){
        return  age;
    }

    void showData() {
        System.out.println(name + " " + password + " " + age);
    }
}


public class Encapsulation {


    public static void main(String[] args) {

        personalDetails en = new personalDetails("Ashpak", 2002, 22);
        en.name = "Sana";
        System.out.println(en.getAge());
    }

}

## Inheritance
- Inheritance is a mechanism in Java that allows one object to acquire all the properties and behaviors of a parent object.
- This allows you to reuse code and makes your code more organized and maintainable.
- we used **extends** Keyword to achived Inheritance.

**Example**
```
class Vehicle {
  // code goes here
}

class Car extends Vehicle {
  // code goes here
}
```



- there are four types of Inheritance
  1. Single Inheritance.
  2. Multilevel Inheritance.
  3. Hierarchicle Inheritnce.
  4. Hybrid Inheritnce.
  5. Multiple Inheritnce.

### 1. Single Inheritance.
- Single inheritance is when a class (child class or subclass) inherits from one superclass (parent class).
- This means that the subclass can acquire the properties and methods of the superclass, enabling code reuse and the extension of existing functionality.
- Example :-
```
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method
        dog.bark(); // Method of Dog class
    }
}
```
### 2. Multilevel Inheritance.
- Multilevel inheritance occurs when a class is derived from another derived class, forming a chain of classes. For example, class C inherits from class B, which inherits from class A.
- Example :- 
```
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Playing");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   // Inherited from Animal
        puppy.bark();  // Inherited from Dog
        puppy.play();  // Method of Puppy class
    }
}
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Playing");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   // Inherited from Animal
        puppy.bark();  // Inherited from Dog
        puppy.play();  // Method of Puppy class
    }
}
```
### 3. Hierarchical Inheritance.
- Hierarchical inheritance involves multiple classes inheriting from a single superclass. 
- This means one base class serves as the parent class for more than one child class.
- Example :- 
```
  class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.eat();  // Inherited from Animal
        dog.bark(); // Method of Dog class
        
        cat.eat();  // Inherited from Animal
        cat.meow(); // Method of Cat class
    }
}
```
### 4. Multiple Inheritance
- Java does not support multiple inheritance directly through classes to avoid complexity and ambiguity (known as the "diamond problem").
- Instead, multiple inheritance is achieved using interfaces, where a class can implement multiple interfaces.
- Example :-
```
interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Animal, Bird {
    public void eat() {
        System.out.println("Eating");
    }

    public void fly() {
        System.out.println("Flying");
    }
}

public class Main {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat(); // Method from Animal interface
        bat.fly(); // Method from Bird interface
    }
}
```
### 5. Hybrid Inheritance
- Hybrid inheritance is a combination of two or more types of inheritance.
- In Java, this typically involves a mix of single, multilevel, and multiple inheritance through interfaces.
- Example :-
```
  interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Eating");
    }

    void bark() {
        System.out.println("Barking");
    }
}

class FlyingDog extends Dog implements Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

public class Main {
    public static void main(String[] args) {
        FlyingDog flyingDog = new FlyingDog();
        flyingDog.eat();  // From Dog class implementing Animal
        flyingDog.bark(); // From Dog class
        flyingDog.fly();  // From Bird interface
    }
}
```

package Oops;

import javax.swing.*;

class PersonalDetails {

    String name;
    int password;
    int age;

    PersonalDetails(String name ,int password,int age){
        this.name = name;
        this.password = password;
        this.age = age;
    }

}
class EmployeeDetails extends PersonalDetails {
    int salary;
    String companyName;


    EmployeeDetails(String name , int password, int age,int salary,String companyName){
        super(name,password,age);
        this.salary = salary;
        this.companyName =companyName;
    }
}

public class Inheritanc {
    public static void main(String[] args) {
        EmployeeDetails pd = new EmployeeDetails( "Ashpak",123,21,2000,"sagitec");

    }
}




## Super Keyword.
- the super keyword is used to refer to the superclass (parent class) of the current object.
- **Whenever you create the instance of subclass, an instance of parent class is created implicitly** which is referred by super reference variable.

### **Usage of Java super Keyword**

#### 1. Call a superclass constructor 
    - When a subclass needs to call a constructor from its superclass, super() is used.
    - Example :-
```
       class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("Dog constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
```
#### 2. Accessing a Superclass Method
  - Access a superclass method that has been overridden in the subclass.
  - If a method in the subclass overrides a method in the superclass, the super keyword can be used to call the overridden method from the superclass.
  - Example :- 
```
  class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating");
    }

    void display() {
        super.eat(); // Calls the eat method of the superclass (Animal)
        eat();      // Calls the eat method of the current class (Dog)
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
```
#### 3.Accessing a Superclass Field
  - Access a superclass field that has been hidden by a field in the subclass
  - If a field in the subclass hides a field in the superclass, the super keyword can be used to access the hidden field.
   - Example :-
```
class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void display() {
        System.out.println("Dog color: " + color);         // Refers to the Dog class field
        System.out.println("Animal color: " + super.color); // Refers to the Animal class field
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}

```

package Oops;


class A{
private int a = 23;
}
class B extends A{
    void printData(){
//        System.out.println(a);
    }
}
public class AccessModifier {

    public static void main(String[] args) {
         B obj = new B();
//         obj.printData(); // we cant Access here becouse a is private
    }

    

}





### Important Points to Remember (super keyword)
- **Constructor Invocation**: The super() call must be the first statement in the subclass constructor.
- **Method and Field Access:** super can be used to access methods and fields from the immediate superclass only.
- **No super in static context:** The super keyword cannot be used in a static context because it refers to the current instance of the subclass.  
By using the super keyword, you can ensure that the subclass correctly initializes and interacts with its superclass, maintaining proper inheritance hierarchies and behaviors.





## Polymorphism
- Polymorphim means having multiple forms.  
- There are two types of Polymorphism
   1. Methode Overloading (Compile time Polymorphim).
   2. Method Overriding (Run-time Polymorphism).  
- Polymorphism allows us to perform a single action in different ways.In other words, polymorphism allows you to define one interface and have multiple implementations

## Methode Overloading (Compile time Polymorphim).(Static)
- When there are multiple functions with the same name but different parameters then these functions are said to be overloaded.
- Functions can be overloaded by changes in the number of arguments or/and a change in the type of arguments.
- **Definition**: If a class has multiple methods with the same name but different parameters, it is known as method overloading.
- **Purpose**: Method overloading increases the readability of the program.

### Ways to Overload Methods in Java

1. **By changing the number of parameters**:
    ```java
    class MathOperations {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }
    ```

2. **By changing the parameter type**:
    ```java
    class MathOperations {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }
    }
    ```

### Note
- In Java, method overloading cannot be achieved by changing the return type of the method alone. The parameters must also be different.
- 
## Methode Overriding (Compile time Polymorphim). (Dynamic Method Dispatch)

- **Definition**: If a subclass (child class) has a method with the same name and parameters as a method in its superclass (parent class), it is known as method overriding.
- **Purpose**: Method overriding is used to provide a specific implementation of a method that is already defined by its superclass. It is primarily used for runtime polymorphism.

### Usage of Java Method Overriding
- To implement the method defined in a superclass with a specific behavior in the subclass.
- To achieve runtime polymorphism.

### Rules for Java Method Overriding
1. The method in the child class must have the same name as in the parent class.
2. The method must have the same parameter list as in the parent class.
3. There must be an IS-A relationship (inheritance) between the classes.

### Example of Method Overriding
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String args[]) {
        Animal a = new Dog();
        a.sound();  // Output: Dog barks
    }
}


package Oops;

class Superclass{
    void print(){
        System.out.println("SuperClass");
    }
}

class Subclass extends Superclass{

    // method Overriding
    void print(){
        System.out.println("Subclass");
    }
}

public class Polymorphism extends Superclass {


    // Method overloading

    float add(float a, float b) {
        return a + b;
    }

    float add(int a, int b, int c) {
        return a + b + c;
    }

    float add(float a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {

        Polymorphism obj = new Polymorphism();

        System.out.println(obj.add(20, 23));
        System.out.println(obj.add(20, 30, 10));
        System.out.println(obj.add(20, 30, 10, 40));
        System.out.println(obj.add(20.51f, 30, 10));


    }
}




## Abstraction
- Abstraction is a fundamental concept in object-oriented programming (OOP) that allows you to focus on the essential features of an object while hiding the unnecessary details of its implementation.
- In Java, abstraction is achieved using two key constructs:
    
#### 1. Abstract Classes:
        - An abstract class is a class that cannot be instantiated (you cannot create objects from it directly).
        - It is declared using the abstract keyword.
        - An abstract class can contain abstract methods (methods without a body) and concrete methods (methods with a body).
        - Classes that inherit from an abstract class must provide implementations for all its abstract methods.
```
        abstract class Animal { // Abstract class
    public abstract void makeSound(); // Abstract method

    public void eat() { // Concrete method
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal { // Concrete subclass
    public void makeSound() { // Implementing abstract method
        System.out.println("Woof!");
    }
}

// Usage
Dog myDog = new Dog();
myDog.makeSound(); // Output: Woof!
myDog.eat(); // Output: Animal is eating
```
#### 2. Interfaces:
- An interface is a contract that defines a set of methods that a class must implement.
- It is declared using the interface keyword.
- All methods in an interface are implicitly public and abstract (before Java 8).
- A class can implement multiple interfaces.
```
  interface Shape {
    double getArea(); // Abstract method
    double getPerimeter(); // Abstract method
}

class Circle implements Shape {
    // ... Implementation of getArea() and getPerimeter() methods
}

class Rectangle implements Shape {
    // ... Implementation of getArea() and getPerimeter() methods
}
```




package Oops;

interface Animal {
    public void sound();
}

interface dog {
    public void sound();
}

class Tiger implements Animal, dog {
    public void sound() {
        System.out.println("Sound.........");
    }
}

public class AbstracClass {
    public static void main(String[] args) {
        Tiger obj = new Tiger();
        obj.sound();
    }
}







