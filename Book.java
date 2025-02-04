class Book {
    // Access modifiers for Book class
    public String ISBN;
    protected String title;
    private String author;

    // Public methods to set and get author name
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    // Access protected and public members in subclass
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }

    public static void main(String[] args) {
        EBook ebook = new EBook();
        ebook.ISBN = "123456789";
        ebook.title = "Java Programming";
        ebook.setAuthor("John Doe");
        ebook.displayBookDetails();
        System.out.println("Author: " + ebook.getAuthor());
    }
}
