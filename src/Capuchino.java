public class Capuchino extends Coffee {
    public Capuchino(int kolMilk, int kolWater, TypeCoffee typeCoffee) {
        super(kolMilk, kolWater, typeCoffee);
    }

    @Override
    public void cretedCoffee() {
        System.out.println("Вы заказали кофе " + typeCoffee);
    }

    public String toString() {
        return "\nCapuchino{" +
                "kolMilk" + getKolMilk() +
                "kolWater" + getKolWater() +
                "typeCoffee=" + typeCoffee +
                '}';
    }
}
