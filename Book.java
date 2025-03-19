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
This is the Book.java file

It is the class for object Book that is used to populate an ArrayList of Book objects in the class Bookshelf

It contains in it the parameters needed for the book and the constructor needed for the book
*/


public class Book {

    //Book object parameters
    int yearOfPublication;
    String ISBN, edition, title, author, publisher;


    //Book object constructor
    Book(String ISBN, String edition, int yearOfPublication, String title, String author, String publisher){
        this.ISBN = ISBN;
        this.edition = edition;
        this.yearOfPublication = yearOfPublication;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    //setters

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setEdition(String edition){
        this.edition = edition;
    }

    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor (String author){
        this.author = author;
    }

    public void setPublisher (String publisher){
        this.publisher = publisher;
    }

    //getters

    public String getISBN(){
        return ISBN;
    }

    public String getEdition(){
        return edition;
    }

    public int getyearOfPublication (){
        return yearOfPublication;
    }

    public String getTitle (){
        return title;
    }

    public String getAuthor (){
        return author;
    }

    public String getPublisher (){
        return publisher;
    }

}