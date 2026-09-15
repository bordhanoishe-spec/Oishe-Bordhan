public // Dog.java
class Dog {
    // Attributes
    private String name;
    private String breed;

    // Constructor to set initial attributes
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to display dog details
    public void displayInfo() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        // Creating two instances of the Dog class using the constructor
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        System.out.println("Initial Values:");
        dog1.displayInfo();
        dog2.displayInfo();

        // Modifying attributes using setter methods
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");

        dog2.setName("Rocky");
        dog2.setBreed("Boxer");

        // Printing the updated values
        System.out.println("\nUpdated Values:");
        dog1.displayInfo();
        dog2.displayInfo();
    }
} 
