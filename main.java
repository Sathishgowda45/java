class book {
    int bookid;
    String title;
    String author;
    float price;

    static int total_books = 0;

    // Constructor
    book(int bookid, String title, String author, float price) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.price = price;
        total_books++;
    }

    // Display book details
    void display() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book Price: " + price);
        System.out.println();
    }

    // Search by book ID
    boolean search(int bookid) {
        return this.bookid == bookid;
    }

    // Search by book title
    boolean search(String title) {
        return this.title == title;
    }

    // Find the costlier book
    book costlier(book other) {
        if (this.price >= other.price) {
            return this;
        } else {
            return other;
        }
    }

    // Get total number of books
    static int get_total_books() {
        return total_books;
    }
}

public class main {
    public static void main(String[] args) {

        book b1 = new book(1, "fire", "anil", 100.0f);
        book b2 = new book(2, "water", "arun", 299.5f);
        book b3 = new book(3, "world", "anu", 477.0f);

        // Display books
        b1.display();
        b2.display();
        b3.display();

        // Search by book ID
        System.out.println("Search by book ID:");

        if (b1.search(1)) {
            System.out.println("Book ID found");
        } else {
            System.out.println("Book ID not found");
        }

        // Search by book title
        System.out.println("\nSearch by book title:");

        if (b1.search("fire")) {
            System.out.println("Book title found");
        } else {
            System.out.println("Book title not found");
        }

        // Find costlier book
        System.out.println("\nCostlier book between b1 and b2:");

        book costlier = b1.costlier(b2);
        costlier.display();

        // Total number of books
        System.out.println("Total number of books: "
                + book.get_total_books());
    }
}






				
			
		
	
