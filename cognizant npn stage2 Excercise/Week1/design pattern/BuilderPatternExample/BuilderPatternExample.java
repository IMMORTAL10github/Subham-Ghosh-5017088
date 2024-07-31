package BuilderPatternExample;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer comp1 = new Computer.Builder()
            .setCPU("Core i9-13900K")
            .setRAM("15GB")
            .setStorage("2TB SSD")
            .build();

        Computer comp2 = new Computer.Builder()
            .setCPU("AMD Ryzen 7 7800X3D")
            .setRAM("10GB")
            .setStorage("1TB SSD")
            .build();

        System.out.println(comp1);
        System.out.println(comp2);
    }
}

