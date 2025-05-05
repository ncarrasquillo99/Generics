// Base classes
// 2 attributes name and quantity
class Fruit {
    String name;
    int quantity; //  integer for fruits

    // Nested constructor method initializes name and quantity
    Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // After initializing we then invoke name and quantity returning the values.
    @Override
    public String toString() {
        return "Fruit: " + name + " (Quantity: " + quantity + ")";
    }
}

class Vegetable {
    String name;

    Vegetable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vegetable: " + name;
    }
}

class Bread {
    String name;
    double weight; //  double for bread

    Bread(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bread: " + name + " (Weight: " + weight + " kg)";
    }
}
