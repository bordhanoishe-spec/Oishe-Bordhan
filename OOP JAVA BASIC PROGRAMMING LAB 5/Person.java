// Person.java
class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor to set attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating two instances of the Person class using the constructor
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Printing their name and age
        System.out.println("Person 1 Details:");
        person1.displayInfo();

        System.out.println("\nPerson 2 Details:");
        person2.displayInfo();
    }
}
