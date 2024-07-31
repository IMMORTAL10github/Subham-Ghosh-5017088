public class Main {

    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Ravi", 450.0),
            new Order(2, "Priya", 100.0),
            new Order(3, "Suresh", 150.0),
            new Order(4, "Trina", 200.0)
        };

        System.out.println("Original Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Bubble Sort
        SortingAlgorithms.bubbleSort(orders);
        System.out.println("\nOrders after Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Resetting the orders array
        orders = new Order[]{
            new Order(1, "Ravi", 450.0),
            new Order(2, "Priya", 100.0),
            new Order(3, "Suresh", 150.0),
            new Order(4, "Trina", 200.0)
        };

        // Quick Sort
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}