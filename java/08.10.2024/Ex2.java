import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        Library lib = new Library();
        System.out.println(lib.toString());
        lib.delBook(2);
        System.out.println(lib.toString());
        lib.delBook(2);
        System.out.println(lib.toString());
        lib.addBook(new Book(
            "Hello", 
            new Author(
                "Dick Manski",
                "dickman@innopolis.university",
                'm'
            ), 
            30, 
            79
        ));
        System.out.println(lib.toString());
    }

    public static Book testBook1() {
        Book book = new Book(
            "Amelia Overcoocked", 
            new Author(
                "Dooglas", 
                "dog@gmail.com",
                'm'
            ), 
            20
        );
        book.setQty(43);
        return book;
    }

    public static Book testBook2() {
        Book book = new Book(
            "Lil Nimsi", 
            new Author(
                "Dooglas", 
                "dog@gmail.com",
                'm'
            ), 
            40
        );
        return book;
    }

    public static Book testBook3() {
        Book book = new Book(
            "Crococity", 
            new Author(
                "Meriaglod", 
                "meri@glod.d",
                'w'
            ), 
            24
        );
        book.setQty(9000);
        return book;
    }

    public static class Book {
        String name;
        Author author;
        double price;
        int qty = 0;

        public Book(String name, Author author, double price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }

        public Book(String name, Author author, double price, int qty) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qty = qty;
        }

        public String getName() { return name; }
        public Author getAuthor() { return author; }
        public double getPrice() { return price; }
        public void setPrice(double price) {this.price = price;}
        public int getQty() { return qty; }
        public void setQty(int qty) {this.qty = qty;}
        public String toString() {
            return String.format(
                "Book[name=%s,%s,price=%f,gty=%d]",
                name, author.toString(), price, qty
            );
        }
    }

    public static class Author {
        String name;
        String email;
        char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String toString() {
            return String.format(
                "Author[name=%s,email=%s,gender=%c]",
                name, email, gender
            );
        }
    }

    public static class Library {
        List<Book> books;

        public Library() {
            books = generate_lib();
        }

        public void addBook(Book book) {
            System.out.println("Book: "+(books.size()+1)+" added");
            books.add(book);
        }

        public void delBook(int index) {
            if (0 <= index && index < books.size()){
                books.remove(index);
                System.out.println("Book: "+index+" deleted");
            }
            else
                System.out.println("Book: "+index+" not found");
        }

        public String toString() {
            String result = "";
            result += "Here are books in lib:\n";
            for (int i = 0; i < books.size(); i++) {
                result += String.format(i+1+") "+books.get(i).toString()+"\n");
            }
            return result;
        }
        
        public static List<Book> generate_lib() {
            List<Book> lib = new ArrayList<Book>();
            lib.add(testBook1());
            lib.add(testBook2());
            lib.add(testBook3());
            return lib;
        }
    }
}
