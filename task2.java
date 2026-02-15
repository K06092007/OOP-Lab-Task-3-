class Mobile {
    String brand;
    String model;
    double price;

    public Mobile() {
        this.brand = "Unknown Brand";
        this.model = "Unknown Model";
        this.price = 0.0;
    }

    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Mobile defaultPhone = new Mobile();
        defaultPhone.displayDetails();

        Mobile newPhone = new Mobile("Samsung", "Galaxy S24", 799.99);
        newPhone.displayDetails();
    }
}
