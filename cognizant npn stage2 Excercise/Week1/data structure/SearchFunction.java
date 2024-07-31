import java.util.Arrays;

public class SearchFunction{
    public static Product linearSearch(Product[] items, String search)
    {
        for(Product i:items)
        {
            if(i.productName.equalsIgnoreCase(search))
            return i;
        }
        return null;
    }

    public static Product binarySearch(Product[] items, String search)
    {
        Arrays.sort(items);
        int left=0;
        int right=items.length-1;
        
        while(left<=right)
        {
            int mid=(left+right)/2;            
            int compare=items[mid].productName.compareTo(search);
            if(compare==0)
            return items[mid];
            if(compare<0)
            left=mid+1;
            else
            right=mid-1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] items={
            new Product(1,"Laptop","Electronics"),
            new Product(2,"Jacket","Garments"),
            new Product(3,"Frypan","Utensils"),
            new Product(4,"Pen","Stationary"),
            new Product(5,"Shampoo","Cosmetics"),
        };
        
        Product linear_res=linearSearch(items,"Laptop");
        if(linear_res!=null)
        System.out.println("Linear Search-Product found");
        else
        System.out.println("Linear Search-Product not found");

        Product binary_res=binarySearch(items, "Bottle");
        if(binary_res!=null)
        System.out.println("Binary Search-Product found");
        else
        System.out.println("Binary Search-Product not found");

    }
}

