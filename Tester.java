// IT1214_Practical_Worksheet_01
// BY 2022/ICT/81

class Student {
    private String name;
    private String rollNo;
    private String course;

    // Corrected Constructor
    Student(String name, String rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class Rectangle {
    private int length;
    private int breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int area() {
        return length * breadth;
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    // Overloaded method for three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    // Overloaded method for double values
    double add(double a, double b) {
        return a + b;
    }
}

class Vehicle {
    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String model;

    @Override
    void display() {
        super.display();
        System.out.println("Model: " + model);
    }
}

class BankAccount {
    private String accountHolderName;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0; // Default price
    }
}

class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }
}

class TemperatureConverter {
    double toFahrenheit(double celsius) { // Corrected method name
        return (celsius * 9 / 5) + 32;
    }
    double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Role: Manager");
    }
}

public class Tester {
    public static void main(String[] args) {
        // Q1: Student
        Student student = new Student("John Doe", "2025/ICT/101", "Information Technology"); // Corrected roll number
        student.display();

        // Q2: Rectangle
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 10);
        System.out.println("Area of rect2: " + rect2.area());

        // Q3: Calculator
        Calculator calc = new Calculator();
        System.out.println("Add two integers: " + calc.add(2, 3));
        System.out.println("Add three integers: " + calc.add(2, 3, 4));
        System.out.println("Add two doubles: " + calc.add(2.5, 3.5));

        // Q4: Vehicle and Car
        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 120;
        car.model = "Corolla";
        car.display();

        // Q5: BankAccount
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.withdraw(1500);
        account.displayBalance();

        // Q6: Book
        Book book1 = new Book("Java Basics", "Author A", 300.0);
        Book book2 = new Book("Python Essentials", "Author B");

        // Q7: Shape and Circle
        Circle circle = new Circle(5.0);
        circle.area();

        // Q8: Person
        Person person = new Person();
        person.setName("Alice");
        person.setAge(25);
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());

        // Q9: TemperatureConverter
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("30 Celsius to Fahrenheit: " + converter.toFahrenheit(30));
        System.out.println("86 Fahrenheit to Celsius: " + converter.toCelsius(86));
        
        // Q10: Employee and Manager
        Manager manager = new Manager("Bob", 201, 75000);
        manager.display();
    }
}
