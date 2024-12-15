import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static public ArrayList<Book> books = new ArrayList<Book>();

    public static void main(String[] args) {
        Book book1 = new Book("the fall of the house of asher", "Edgard Allan Poe");
        Book book2 = new Book("it", "stephen king");
        Book book3 = new Book("100 leades", "alex hormozi");

        addBook( book1 );
        addBook( book2 );
        addBook( book3 );

        removeBook("it");


        for (Book book : books ) {
            System.out.println("book title is : " + book.title);
        }


    }

    static void addBook ( Book book ) {
        books.add( book );
    }

    static void removeBook (String title) {
        for (Book book : books ) {
            if ( book.title == title) {
                books.remove(book);
            }
        }
    }
}