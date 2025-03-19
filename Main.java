//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
this is the Main.java file. it stores test cases for the Question 1 of Assignment 1
 */

/*
The test cases for Assignment 2 Question 1 are seperated into: simple case, illegal case, complex case, special case
They can be found in this main method, commented out but each one can be uncommented for testing purposes
 */

public class Main {
    public static void main(String[] args) {

        //test cases for Question 1 (in relation to classes: Pig, Sheep, Duck, Cow)


        //test cases (4: (1) simple cases, (2) illegal/unexpected cases, (3) complex cases, (4) special cases for the tests


        //(1) simple case ==> calling one animal that extends from Animal class
        //making specifically Pig data type (though it can also be Animal because that extends)

        Pig pigAnimal = new Pig();

        pigAnimal.sound();



        //(2) illegal case ==> can pass values that do not work....

           Pig pigAnimal2 = new Pig();

        //line 53 is commented out because it breaks the program. uncomment to verify

     //   pigAnimal.sound(hello);


        //(3) complex case ==> trying every option by making an object of each Animal and calling its sound() method
        //here purposefully because the different animals extend from Animal, it is doable to have that as the data type
        //(rather than the individual animal name types)


        Animal pigAnimal3 = new Pig();

        pigAnimal3.sound();

        Animal sheepAnimal = new Sheep();

        sheepAnimal.sound();

        Animal duckAnimal = new Duck();

        duckAnimal.sound();

        Animal cowAnimal = new Cow();

        cowAnimal.sound();


        //(4) special case ==> calling only the data type dependent sound() methods

        Pig pigAnimal4 = new Pig();

        pigAnimal4.nameOfAnimal = "pig";

        pigAnimal4.sound(2);

        Sheep sheepAnimal2 = new Sheep();

        sheepAnimal2.nameOfAnimal = "sheep";

        sheepAnimal2.sound(5.78);

        Duck duckAnimal2 = new Duck();

        duckAnimal2.nameOfAnimal = "duck";

        duckAnimal2.sound("hello");

        Cow cowAnimal2 = new Cow();

        cowAnimal2.nameOfAnimal = "cow";

        cowAnimal2.sound(true); //notice on print its "cow says woof" because the Boolean data type sound() prints woof


        //test cases for question 2 are in the main of Bookshelf.java

    }
}