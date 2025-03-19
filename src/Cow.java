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
this is the Cow.java file it is the Cow class.
It extends from the Animal class so it is a child of the parent class Animal, or a subclass of superclass Animal.
It has an overrided sound() method from Animal class that specifically calls moo rather than being depended on data type passed
*/

public class Cow extends Animal{

    //overriding sound() method per instruction
    @Override
    public void sound(){
        System.out.println("moo");

    }
}