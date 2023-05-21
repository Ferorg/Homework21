public class Epresso extends Coffee {
    public Epresso(int kolMilk, int kolWater, TypeCoffee typeCoffee) {
        super(kolMilk, kolWater, typeCoffee);
    }

    @Override
    public void cretedCoffee() {
        System.out.println("Вы заказали кофе " + typeCoffee);
    }

    public String toString() {
        return "\nEspresso{" +
                "kolMilk" + getKolMilk() +
                "kolWater" + getKolWater() +
                "typeCoffee=" + typeCoffee +
                '}';
    }
}

