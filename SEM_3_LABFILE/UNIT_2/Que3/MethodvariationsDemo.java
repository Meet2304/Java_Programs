package Que3;
class MethodVariationsDemo{

    // Method to demonstrate passing by value (for primitive data types)
    public static void modifyValue(int num) {
        num += 10;
        System.out.println("Inside modifyValue: " + num);
    }

    // Method to demonstrate passing by reference (for objects)
    public static void modifyArray(int[] arr) {
        arr[0] = 100;
        System.out.println("Inside modifyArray: " + arr[0]);
    }

    // Method to demonstrate returning a value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to demonstrate returning an object
    public static Person createPerson(String name, int age) {
        return new Person(name, age);
    }

    public static void main(String[] args) {
        // Passing by value (primitive data type)
        int num = 5;
        modifyValue(num);
        System.out.println("After modifyValue: " + num);

        // Passing by reference (object)
        int[] numbers = { 1, 2, 3 };
        modifyArray(numbers);
        System.out.println("After modifyArray: " + numbers[0]);

        // Returning a value
        int sum = add(3, 7);
        System.out.println("Sum: " + sum);

        // Returning an object
        Person person = createPerson("Alice", 30);
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

