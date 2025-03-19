/*
Sofiya Markova
3555491
2025-02-24
Assignment 2
Assignment 2 Question 2

Part of Question 2 of Assignment 2:
Define a class called Book. This class should store attributes such as the title, ISBN number, author, edition,
publisher, and year of publication. Provide get/set methods in this class to access these attributes. Define a class
called Bookshelf, which contains the main method. This class should create a few book objects with distinct names and
store them in an ArrayList. This class should then list the names of all books in the ArrayList. Enhance the program by
providing a sort function, which will sort the books in ascending order of their year of publication. Create a few more
Book objects with the same names but with different edition numbers, ISBNs, and years of publication. Add these new Book
objects to the ArrayList, and display the book list sorted by book name; for duplicate books of the same name, sort the
list by year of publication. (Hint: You will need to define a comparator class that takes two Book objects as parameters
of the compareTo method. This method should do a two-step comparison and return a Boolean value. The first comparison
should compare the name of the book. If the name is the same, the second comparison should compare the year of
publication.)
*/

/*
This is the Bookshelf.java file. it has imported into it, through libraries, the class of ArrayList because question
asked to use ArrayList. it has the Comparator class imported because I understood the question to be asking for this
since it mentions to create a comparator. there is an import of java.lang.* for operations and java.util.Collections
because this gets used as well.

there is a created bookshelf of data type ArrayList<Book>

this is possible due to having constructors, how every class needs to have

there is a Bookshelf object constructor that takes in an ArrayList capable of containing Book objects. setting it through
this.bookshelf which will be relevant for the creation of a mini bookshelf for swapping on.

there is an empty constructor for Bookshelf object

in the main method there is the creation of a Bookshelf object to be used for saving books into
there are also the test cases.

the methods I have in this class are as follows:


There is a toString method that I used an Override on because I changed it. I have this here so that I could have a way to print the contents of the Book object for checking. I needed to override it to make sure it works and does not print the location in memory of the object.


In the method there is a String to be used for returning.

There is a for-each loop that iterates on a bookshelf object of this class.

There is a building of the return string

There is a returning of the return string


Next I have a sortFunction for the sorting to be possible.


Inside this sortFunction there is an outer for loop that starts at the bookshelf size – 1 (so that there is no overflow) and subtracts to 0

The inner for loop starts at 0 and increments up to being less than j. the reason is that the outer decrements to check every book in the bookshelf by ensuring it runs through the check for all the books, the inner loop iterates through one round of checking but this means that it does not need to check the very last book every time since the one with the largest year of publication in that batch would be brought to become the rightmost. So, it becomes less every time.

Inside this for loop there is an if block that checks the relation between the year of publication of the book at index and book at index + 1

If it is so that the first book has a year of publication greater than the second book (not the right order), a swap is called by saving first book into a temporary, setting the second book into the location of the first and then setting the location of the second to have the temporary (first book).


There is a BookComparator class which uses the Comparator interface.

There is a compare method in there, which is part of the Comparator interface. It takes in 2 books as a parameter and then returns running the custom made compareTo method. A wildcard is used such that if compareTo returns true then the int of compare returned is 1 and if compareTo returns false then the int of compare returned is –1.

This is such because the Comparator interface expects an int and the compare method of it expects and int. But the question asks for Boolean. Thus, this type casting is done.


This will now explain how the compareTo method works:

It has an if block that uses the comapreTo function to see if the titles of 2 passed books are in alphabetical order where the first book is before the second book, in terms of ASCII values. This is the correct order thus the return is false. This means the answer to the question “need to sort” is no so returning false.

Next there is an else if that checks if the titles of the books are the same. This a situation where need to do a swap which is a sort.

For this a mini bookshelf is created and into it .add the 2 books that want to be comparing for yearOfPublication to be able to see the right order

Then the sortFunction() is called on the mini bookshelf. This does the actual sorting.

Because the point of this compareTo function is to output a Boolean based on whether the books in a bookshelf need to be sorted, the check is on whether the books changed location or not after the compareTo is called.

So, the if checks if the mini bookshelf after sorting has the yearOfPublication of the first book be the same as the yearOfPublication of book1, this means that the books would not have changed location. This gives a return of false. The alternate to this one is return true, so do needing to sort if the first book is not in the location of where book1 was meaning it is where second book is.

The else if is for situations when upon comparing the book titles the number returned is greater than 0 which is a similar logic of as it relates to being equal to 1 but because the compareTo function returns an integer to be not just whether a > b but the actual amount it is greater by (ASCII differences or values) then it can be any integer greater than 1 so I could not just have 1.

This means that after the swap, which is called in comapreTo the return is a value that shows that there is a need for a swap. Thus, the return is true (to question “need to do swap” the answer is true)


The last else is there for error handling, when everything breaks the return is false. So, no need to sort. This is just so that if everything breaks the outcome closer to default happens which is that no sort needs to happen.
*/

/*
The test cases for Assignment 2 Question 1 are seperated into: simple case, illegal case, complex case, special case
They can be found in the main method of this program, commented out but each one can be uncommented for testing purposes
 */




import java.util.ArrayList;
import java.util.Comparator;
import java.lang.*;
import java.util.Collections;

public class Bookshelf {

    //declare ArrayList that contains Book objects called bookshelf. this uses the empty constructor

    ArrayList<Book> bookshelf = new ArrayList<Book>();

    //Bookshelf constructor that takes an ArrayList with Book objects
    Bookshelf(ArrayList<Book> bookshelf) {
        this.bookshelf = bookshelf;
    }

    //empty constructor, needed since overloaded the default constructor to have an option with taking in parameters
    Bookshelf (){
    }

    public static void main(String[] args) {
        //test cases


        //test cases (4: (1) simple cases, (2) illegal/unexpected cases, (3) complex cases, (4) special cases for the tests

        //(1)simple case ==> regular bookshelf with 3 books (example were using)

        //picking a few books to test

        //new bookshelf make to .add Book objects into
        Bookshelf fiction = new Bookshelf();

        //need to do .bookshelf becasue the object of Bookshelf called ficition has an ArrayList called bookshelf
        //to which now adding a new Book object

        fiction.bookshelf.add(new Book("978-0-7334-2398-6", "5", 1996, "pirates", "Bob", "book house"));

        fiction.bookshelf.add(new Book("693-0-7334-2360-6", "2", 1954, "pirates", "Joe", "book island"));

        fiction.bookshelf.add(new Book("978-1-7334-8725-6", "8", 2001, "dino", "Jane", "learning time"));


        System.out.println(fiction.toString()); //prints each book's in fiction title and year of publication (see toString method)

        //calling the sortFunction on its own (to sort based on yearOfPublication)
        fiction.sortFunction();

        System.out.println(fiction.toString());

        //when making a new object need to have () because it is calling the method of constructor (notice () is associated with methods hence it is there) for that new object that is created

        Collections.sort(fiction.bookshelf, new BookComparator());  //2 arguments: 1st is the list to sort, 2nd is the comparator object (which in it has methods for comparing)

        //comparator has to be unique to each data type so need to make new one and pass methods (that is how it turned out that comparator is a class so its own object)

        System.out.println(fiction.toString());


        //(2)illegal/unexpected case ==> bookshelf that has values that are not the right data type in the parameters
        //do when they put in too many values into year

        //new bookshelf make to .add Book objects into
        Bookshelf trial = new Bookshelf();

        //to which now adding a new Book object

        //the test cases on line 172 through 176 are commented out because they break the program. uncomment to verify

      //  trial.bookshelf.add(new Book("978-0-56544-2398-6", "5", "2393", "24534", "Bob", "book house"));

      //  trial.bookshelf.add(new Book("693-0-45645777-2360-6", "2", -1954, 23423432, "Joe", "book island"));

      //  trial.bookshelf.add(new Book("978-1-5346422-8725-6", 8, 2001, "dino", "Jane", "learning time"));


        System.out.println(trial.toString()); //prints each book's in fiction title and year of publication (see toString method)

        //calling the sortFunction on its own (to sort based on yearOfPublication)
        trial.sortFunction();

        System.out.println(trial.toString());

        //when making a new object need to have () because it is calling the method of constructor (notice () is associated with methods hence it is there) for that new object that is created

        Collections.sort(trial.bookshelf, new BookComparator());  //2 arguments: 1st is the list to sort, 2nd is the comparator object (which in it has methods for comparing)

        //comparator has to be unique to each data type so need to make new one and pass methods (that is how it turned out that comparator is a class so its own object)

        System.out.println(trial.toString());


        //(3)complex case ==> big bookshelf with many books that need to be sorted on title and year. there are many of the same titile and differnt years, many of the same year but different title

        //picked more books for the bookshelf

        //new bookshelf make to .add Book objects into
        Bookshelf nonfiction = new Bookshelf();


        nonfiction.bookshelf.add(new Book("978-0-75675-2398-6", "9", 1978, "goob", "Ash", "publish me"));

        nonfiction.bookshelf.add(new Book("693-0-7334-2345645-6", "1", 1978, "goob", "Ash", "publish me"));

        nonfiction.bookshelf.add(new Book("978-1-45634-8725-6", "8", 1956, "flowing", "Jane", "learning time"));

        nonfiction.bookshelf.add(new Book("645643-0-7334-2360-6", "2", 1954, "goob", "Ash", "publish me"));

        nonfiction.bookshelf.add(new Book("94448-1-7334-8725-6", "8", 2001, "dino", "Billy", "learning time"));



        System.out.println(nonfiction.toString()); //prints each book's in fiction title and year of publication (see toString method)

        //calling the sortFunction on its own (to sort based on yearOfPublication)
        nonfiction.sortFunction();

        System.out.println(nonfiction.toString());

        //when making a new object need to have () because it is calling the method of constructor (notice () is associated with methods hence it is there) for that new object that is created

        Collections.sort(nonfiction.bookshelf, new BookComparator());  //2 arguments: 1st is the list to sort, 2nd is the comparator object (which in it has methods for comparing)

        //comparator has to be unique to each data type so need to make new one and pass methods (that is how it turned out that comparator is a class so its own object)

        System.out.println(nonfiction.toString());



        //(4)special case ==> book with same title and year but something else is differnt (a non-checking attribute) ==> want to see what happens

        //chose various options including capitals, spaces, very similar names, capitals in the middle of word, spaces in middle and after word

        //new bookshelf make to .add Book objects into
        Bookshelf fun = new Bookshelf();

        fun.bookshelf.add(new Book("978-0-75675-2398-6", "9", 1978, "crabgrab b", "Ash", "publish me"));

        fun.bookshelf.add(new Book("693-0-7334-2345645-6", "1", 1978, "crabgrab a", "Ash", "publish me"));

        fun.bookshelf.add(new Book("978-1-45634-81245-6", "6", 1978, "crabgrabs ", "Ash", "publish me"));

        fun.bookshelf.add(new Book("645643-0-7334-4656-6", "90", 1954, "crabgram", "Ash", "publish me"));

        fun.bookshelf.add(new Book("645643-03453-2360-6", "1", 1954, "crab grab", "Ash", "publish me"));

        fun.bookshelf.add(new Book("645643-0-7123-34560-6", "1", 1954, "Crabgrab ", "Ash", "publish me"));

        fun.bookshelf.add(new Book("645643-0-7123-2360-6", "2", 1899, "Crabgrab", "Ash", "publish me"));

        fun.bookshelf.add(new Book("645643-0-7334-2360-9", "2", 1954, "claw", "Ash", "pfunni"));

        fun.bookshelf.add(new Book("64532423-0-7334-2360-6", "2", 1954, "cLaw", "Ash", "publish me"));

        fun.bookshelf.add(new Book("978-1-45634-8725-6", "8", 1956, "pillowice", "Jane", "learning time"));

        fun.bookshelf.add(new Book("645643-0-7334-2360-6", "2", 1954, "crabgrab ", "Ash", "publish me"));

        fun.bookshelf.add(new Book("94448-1-7334-8725-6", "8", 2001, "jeans", "Billy", "learning time"));


        System.out.println(fun.toString()); //prints each book's in fiction title and year of publication (see toString method)

        //calling the sortFunction on its own (to sort based on yearOfPublication)
        fun.sortFunction();

        System.out.println(fun.toString());

        //when making a new object need to have () because it is calling the method of constructor (notice () is associated with methods hence it is there) for that new object that is created

        Collections.sort(fun.bookshelf, new BookComparator());  //2 arguments: 1st is the list to sort, 2nd is the comparator object (which in it has methods for comparing)

        //comparator has to be unique to each data type so need to make new one and pass methods (that is how it turned out that comparator is a class so its own object)

        System.out.println(fun.toString());

    }

    //made own toString method so that would be easier for testing. because using the given toString method may break still
    @Override
    public String toString(){

        //string used for returning because toString() method return value is a String
        String returnString = new String();

        //want to loop through the ArrayList Bookshelf that is the ArrayList of Book objects

        //can use for each loop
        for(Book iteratingBook : this.bookshelf){

            //build string to print (only title and dateOfPublication gets sorted so only printing this)
            returnString += "name of book is: " + iteratingBook.title + " and year of publication is: " + iteratingBook.yearOfPublication + " and edition is: " + iteratingBook.edition + "\n";

        }

        return returnString;
    }

    //method that will sort the ArrayList
    //method of the object Bookshelf. It is arranging its own books
    //do not need pass the ArrayList bookshelf because it is a method part of the same object
    public void sortFunction() {

        //will use bubble sort
        //j-- because looking through less and less books every itteration since they were sorted so less needed to check
        //in terms of what needs to be sorted. because it is a decrimenting for loop start at bookshelf.size()-1 [so that does not go out of bounds]
        //and then the j gets decrimineted by 1 all the way to until 0
        for (int j = bookshelf.size() - 1; j > 0; j--) {

            //has to be size() -1 because on the last iteration want to not have it go out of bounds
            //had before i < bookshelf.size() - 1 but that means it would loop through the whole loop every time

            //this is not efficient because do not need to as the last entries get sorted to be in their rightful place
            //so the check is changed to i <= j because j restricts not needing to go the whole array

            for (int i = 0; i < j; i++) {

                //need to this.bookshelf. because this method is part of the same bookshelf object (doing it on this instance of the object)
                //this.bookshelf.get(i) is book1 and this.bookshelf.get(i+1) is book2
                if (this.bookshelf.get(i).yearOfPublication > this.bookshelf.get(i + 1).yearOfPublication) {

                    //sorting part

                    //setting a temporary Book object so to be able to save into it one of the books to be used in the swap
                    //this is so that can temporarily save this object in memory, without losing anything, to then place it
                    //into its new location. while the other object is being placed in its old position

                    Book temporary = this.bookshelf.get(i); //temporary is copy of book 1

                    this.bookshelf.set(i, this.bookshelf.get(i + 1)); //move book2 into the index location of where book 1 was

                    this.bookshelf.set(i + 1, temporary); //put the copy of book1 into the location of where book2 was

                    //doing it with swap (this is just a thing that is possible)
                    //  Collections.swap(this.bookshelf, i, i +1);
                }
            }
        }
    }
}

//comparator is expecting a compare method inside it. and the compare method returns an int
//i had to create a new method called compareTo inside the comparator. this compareTo had to have a return of Boolean per instruction
//the problem is that the comparator class, *a built-in (so i cannot just choose what it can do)*, requires inside of it a compare method *that returns and integer*
//so my solution is to have a random compare method just to have it there
class BookComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2){
        //call compareTo method where the Boolean gets type casted to an int, per requirement of the compare method
        //need to create new comparator object

       return this.compareTo(book1, book2) ? 1 : -1; //if run and compareTo returns a true then compare returns a 1, if run and compareTo returns a false then compare returns a -1 (fufills int return type requirements)

    }

    //method overloading (do not need to do an @Override because we made a new compareTo method technicallly. it is supposed to return int but here return Boolean. so for that reason do not need to Override)

    public Boolean compareTo(Book book1, Book book2) {
        //compare the titles. can do this by doing operation on strings(the chars can be compared because ASCI)
        //on the title can do the compareTo method
        //taking the title strings from the object book to compare hence the .title
        //check if need to swap. Boolean false => yes swap. true => no swap

        if (book1.title.compareTo(book2.title) <= -1) { //takes care of -1 which is b > a

            return false; //different book titles but no need to swap

        } else if (book1.title.compareTo(book2.title) == 0) { // takes care of 0 which is a = b

             //compare year
            //call sort function
            //making mini bookshelf that will contain 2 books of same name and sort them by year of publication
            //this will be what the sortFunction will be called on

            Bookshelf miniBookshelfForSorting = new Bookshelf();
            miniBookshelfForSorting.bookshelf.add(book1);
            miniBookshelfForSorting.bookshelf.add(book2);

            miniBookshelfForSorting.sortFunction();

            //need to tell the output
            //sortFunction() gives us which one is smaller vs larger

            //if the first entry is book1

            if(miniBookshelfForSorting.bookshelf.get(0).yearOfPublication == book1.yearOfPublication){ //do not need to do sorting
                    //when the books in mini bookshelf did not change order
                return false;

            }else { //greater than 1
                    //when books in mini bookshelf did change order  //do need sorting
                return true;
            }

        }else if (book1.title.compareTo(book2.title) > 0){ //takes care of 1 which is a > b
            return true; //different book titles but need to swap
        }else{ //defualt return value if everything breaks, then do not sort (false) because to question "need to do sorting" answer is no = false
            return false; //so can see logic
        }
    }
}