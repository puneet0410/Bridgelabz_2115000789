public class Book {
  String title;
  String author;
  final int isbn;
  static String libraryName;

  static void displayLibraryName(){
    System.out.println("Library name = "+libraryName);


  }
  Book(String title,String author,int isbn){
    this.title=title;
    this.author=author;
    this.isbn=isbn;
  }
  void displayDetails(){
    System.out.println("Title = "+title);
    System.out.println("Author = " + author);
    
  }
  public static void main(String[]args){
    Book b1=new Book("My Life","Puneet",1234);
    libraryName="UK Library";
    b1.displayDetails();
    b1.displayLibraryName();
    if(b1 instanceof Book){
      System.out.println("I am instance of Book");
    }





  }
}
