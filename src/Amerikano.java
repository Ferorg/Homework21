public class Amerikano extends Coffee {
    public Amerikano(int kolMilk, int kolWater, TypeCoffee typeCoffee) {
        super(kolMilk, kolWater, typeCoffee);
    }

    @Override
    public void cretedCoffee() {
        System.out.println("Вы заказали кофе " + typeCoffee);
    }

    public String toString() {
        return "\nAmerikano{" +
                "kolMilk" + getKolMilk() +
                "kolWater" + getKolWater() +
                "typeCoffee=" + typeCoffee +
                '}';
    }
}
