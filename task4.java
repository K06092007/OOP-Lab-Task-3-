class Computer {
    String systemID;
    String processorType;
    int ramSize;
    String operatingSystem;

    Computer(String id, String processor, int ram, String os) {
        systemID = id;
        processorType = processor;
        ramSize = ram;
        operatingSystem = os;
    }

    void displayDetails() {
        System.out.println("System ID: " + systemID);
        System.out.println("Processor: " + processorType);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Operating System: " + operatingSystem);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("PC-01", "Intel Core i5", 8, "Windows 10");
        Computer c2 = new Computer("PC-02", "AMD Ryzen 7", 16, "Windows 11");

        c1.displayDetails();
        c2.displayDetails();
    }
}

