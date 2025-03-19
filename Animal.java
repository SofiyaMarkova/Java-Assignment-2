/*
Sofiya Markova
3555491
2025-02-24
Assignment 2
Assignment 2 Question 1

Part of Question 1 of Assignment 2:
Write a class called Animal with overload sound() methods. These methods should be overloaded based on various primitive
data types and print different types of animal sounds (“oink,” “honk,” etc.) depending on which overload version is
called. You may use the program you wrote for Assignment 1, question 4 as a starting point. Create child classes for
Pig, Sheep, Duck, and Cow. Every child class has its override sound() method, and the override method will call the
appropriate overload sound() method according to what animal it represents. Write a main() that creates instances of
different animals, and calls these animal instances sound() method, so different animals will print different sounds
accordingly. Note: The sound() method does not generate the sound; it only prints the sound word to output.
*/

/*
This is the same class as from Assignment 1 called Animal.java

"Write a class called Animal with an overloaded sound() method. This method should be overloaded based on various
primitive data types and print different types of animal sounds (“oink,” “honk,” etc.) depending on which overloaded
version is called. Write a main() that calls all the different versions. Note: The sound() method does not generate the
sound; it only prints the sound word as output. In main(), test the methods by calling all the overloaded methods to
print animal sounds."
*/

public class Animal {

    public String nameOfAnimal;

    //empty constructor ==> used by the classes that extend from Animal (Pig, Sheep, Duck, Cow)
    Animal() {
    }

    //constructor taking a String for the animal name to set it
    Animal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    //sound() method that does not take any parameters (for overriding in Pig, Sheep, Duck, Cow)
    public void sound() {

    }

    //methods from Animal method of Assignment 1 (here to show that I used what I did before to built on)
    public void sound(int i) {
        System.out.println(nameOfAnimal + " says oink");
    }

    public void sound(double j) {
        System.out.println(nameOfAnimal + " says honk");
    }

    public void sound(String k) {
        System.out.println(nameOfAnimal + " says quack");
    }

    public void sound(Boolean l) {
        System.out.println(nameOfAnimal + " says woof");
    }

}