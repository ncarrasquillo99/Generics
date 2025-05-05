// Specific fruits with integer quantity
// Apple inherits the Fruit class to invoke the quantity attribute
class Apple extends Fruit {
    Apple(int quantity) {
        super("Apple", quantity);
    }
}

class Orange extends Fruit {
    Orange(int quantity) {
        super("Orange", quantity);
    }
}

class Grape extends Fruit {
    Grape(int quantity) {
        super("Grape", quantity);
    }
}

// Specific vegetables
class Carrot extends Vegetable {
    Carrot() {
        super("Carrot");
    }
}

class Potato extends Vegetable {
    Potato() {
        super("Potato");
    }
}

// Specific breads with double weight
class Bagel extends Bread {
    Bagel(double weight) {
        super("Bagel", weight);
    }
}

class Baguette extends Bread {
    Baguette(double weight) {
        super("Baguette", weight);
    }
}
