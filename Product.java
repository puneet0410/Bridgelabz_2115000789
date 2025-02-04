

public class Product{
 String productName;
 int price;
 int quantity;
 final int productId;
 static int discount;
 Product(String productName,int price,int quantity,int productId){
this.productName=productName;
this.price=price;
this.quantity=quantity;
this.productId=productId;
}
static void updateDiscount(int newDiscount){
    discount=newDiscount;
 }
void displayDetails(){
    System.out.println(productName);
    System.out.println(price);
    System.out.println(quantity);
    System.out.println(productId);
    double discountedPrice=price-(price*(discount/100.0));
    System.out.println(discountedPrice);
}
  public static void main(String[] args) {
    
    Product p1=new Product("maggie maker",1000,12,234);
    Product.updateDiscount(50);
    if(p1 instanceof Product){
        p1.displayDetails();
    }
 }   
}