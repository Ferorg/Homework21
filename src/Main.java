public class Main {
    public static void main(String[] args) {
        CoffeeHouse coffeeHouse = CoffeeHouse.getInstance();
        CoffeeFabrick coffeeFabrick = new CoffeeFabrick();
        Coffee coffee1 = coffeeFabrick.createdCoffee(TypeCoffee.AMERICANO);
        Coffee coffee2 = coffeeFabrick.createdCoffee(TypeCoffee.CAPUCHINO);
        Coffee coffee3 = coffeeFabrick.createdCoffee(TypeCoffee.ESPRESSO);
        Coffee coffee4 = coffeeFabrick.createdCoffee(TypeCoffee.LATTE);
        System.out.println(coffeeHouse.toString());
    }
}