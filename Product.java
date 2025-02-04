class Product {
  // Instance Variables
  String productName;
  double price;

  // Class Variable
  static int totalProducts = 0; // Shared among all products

  // Constructor to initialize product details and update totalProducts
  public Product(String productName, double price) {
      this.productName = productName;
      this.price = price;
      totalProducts++; // Increment totalProducts whenever a new product is created
  }

  // Instance method to display product details
  public void displayProductDetails() {
      System.out.println("Product Name: " + productName);
      System.out.println("Price: $" + price);
  }

  // Class method to display the total number of products created
  public static void displayTotalProducts() {
      System.out.println("Total Products: " + totalProducts);
  }

  public static void main(String[] args) {
      Product p1 = new Product("Laptop", 800.00);
     
      p1.displayProductDetails();
      
      Product.displayTotalProducts();
  }
}
