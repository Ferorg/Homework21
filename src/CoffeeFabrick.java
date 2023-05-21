public class CoffeeFabrick implements CoffeFabrick {
    @Override
    public Coffee createdCoffee(TypeCoffee typeCoffee) {
        Coffee coffee = null;
        CoffeeHouse coffeeHouse = CoffeeHouse.getInstance();
        switch (typeCoffee) {
            case AMERICANO:
                coffee = new Amerikano(0, 90, typeCoffee);
                coffee.cretedCoffee();
                break;
            case LATTE:
                coffee = new Latte(45, 35, typeCoffee);
                coffee.cretedCoffee();
                break;
            case ESPRESSO:
                coffee = new Epresso(0, 35, typeCoffee);
                coffee.cretedCoffee();
                break;
            case CAPUCHINO:
                coffee = new Capuchino(17, 35, typeCoffee);
                coffee.cretedCoffee();
                break;
        }
        coffeeHouse.addCoffeeInMenuZakaza(coffee);
        return coffee;
    }


}
