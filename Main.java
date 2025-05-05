public class Main {
    public static void main(String[] args) {
        // container for fruits
        // <T> in Container class is replaced in this object with apple, Orange, and Grape along with integers mixing them together.
        Container<Fruit> fruitContainer = new Container<>();
        fruitContainer.add(new Apple(10));    // Adding 10 apples
        fruitContainer.add(new Orange(5));    // Adding 5 oranges
        fruitContainer.add(new Grape(50));    // Adding 50 grapes

        // Another container for vegetables
        Container<Vegetable> vegetableContainer = new Container<>();
        vegetableContainer.add(new Carrot());  // Adding a carrot
        vegetableContainer.add(new Potato());  // Adding a potato

        // Another container for breads
        Container<Bread> breadContainer = new Container<>();
        breadContainer.add(new Bagel(0.5));    // Adding a bagel with weight 0.5kg
        breadContainer.add(new Baguette(1.2)); // Adding a baguette with weight 1.2kg

        // Print out the items in each container
        System.out.println("Fruits in the container:");
        fruitContainer.printItems();

        System.out.println("\nVegetables in the container:");
        vegetableContainer.printItems();

        System.out.println("\nBreads in the container:");
        breadContainer.printItems();
    }
}