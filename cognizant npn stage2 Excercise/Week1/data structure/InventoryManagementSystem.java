import java.util.HashMap;
import java.util.*;

class Product{
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price)
    {
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }

    public String toString()
    {
        return "Product{"+ "productId = "+productId+", productName = "+productName+", quantity = "+quantity+", price = "+price+"}";
    }
}

public class InventoryManagementSystem{
    private HashMap<Integer,Product> inventory=new HashMap<>();

    public void addProduct(Product product)
    {
        inventory.put(product.productId,product);
    }

    public void updateProduct(int productId,Product updatedProduct)
    {
        if(inventory.containsKey(productId))
        {
            inventory.put(productId,updatedProduct);
        }
        else
        {
            System.out.println("Product not found");
        }
    }

    public void deleteProduct(int productId)
    {
        if(inventory.containsKey(productId))
        {
            inventory.remove(productId);
        }
        else
        {
            System.out.println("Product not found");
        }
    }

    public Product geProduct(int productId)
    {
        return inventory.get(productId);
    }

    public static void main(String[] args) {
        InventoryManagementSystem ob=new InventoryManagementSystem();
        ob.addProduct(new Product(1, "Phone", 10, 1000.99));
        ob.addProduct(new Product(2, "Laptop", 50, 7000.99));
        ob.addProduct(new Product(3, "Tablet", 25, 6500.99));

        System.out.println(ob.geProduct(1));
        System.out.println(ob.geProduct(2));
        System.out.println(ob.geProduct(3));

        ob.updateProduct(1,new Product(1,"Smartphone",45,3499.55));
        System.out.println(ob.geProduct(1));

        ob.deleteProduct(3);

    }
}


