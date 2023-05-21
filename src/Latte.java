public class Latte extends Coffee{
    public Latte(int kolMilk, int kolWater, TypeCoffee typeCoffee) {
        super(kolMilk, kolWater, typeCoffee);
    }

    @Override
    public void cretedCoffee() {
        System.out.println("Вы заказали кофе "+typeCoffee);
    }

    @Override
    public String toString() {
        return "\nLatte{" +
                "kolMilk"+getKolMilk()+
                "kolWater"+getKolWater()+
                "typeCoffee=" + typeCoffee +
                '}';
    }
}
