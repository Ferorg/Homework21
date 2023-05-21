import java.util.ArrayList;
import java.util.List;

public class CoffeeHouse {
    private static CoffeeHouse coffeeHouse;
    private List<Coffee> menuZakaza;

    private CoffeeHouse() {

    }

    public static CoffeeHouse getInstance() {
        if (coffeeHouse == null) {
            coffeeHouse = new CoffeeHouse();
        }
        return coffeeHouse;
    }

    public void addCoffeeInMenuZakaza(Coffee coffee) {
        if (menuZakaza == null) {
            menuZakaza = new ArrayList<>();
            menuZakaza.add(coffee);
        } else {
            menuZakaza.add(coffee);
        }
    }

    @Override
    public String toString() {
        return "CoffeeHouse{" +
                "\nmenuZakaza=" + menuZakaza +
                '}';
    }
}