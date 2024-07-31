public class Product implements Comparable<Product>{
    int productId;
    String productName;
    String category;

 public Product(int productId, String productName, String category)
 {
    this.productId=productId;
    this.productName=productName;
    this.category=category;
 }
 public String toString()
 {
    return "Product{"+"productId = "+productId+", productName = "+productName+", category = "+category+"}";
 }
 public int compareTo(Product other) {
    return this.productName.compareTo(other.productName);
}

}