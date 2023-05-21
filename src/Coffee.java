public abstract class Coffee {
    private int kolMilk;
    private int kolWater;
    TypeCoffee typeCoffee;

    public Coffee(int kolMilk, int kolWater, TypeCoffee typeCoffee) {
        this.kolMilk = kolMilk;
        this.kolWater = kolWater;
        this.typeCoffee = typeCoffee;
    }

    public abstract void cretedCoffee();

    public int getKolMilk() {
        return kolMilk;
    }

    public void setKolMilk(int kolMilk) {
        this.kolMilk = kolMilk;
    }

    public int getKolWater() {
        return kolWater;
    }

    public void setKolWater(int kolWater) {
        this.kolWater = kolWater;
    }


    public TypeCoffee getTypeCoffee() {
        return typeCoffee;
    }

    public void setTypeCoffee(TypeCoffee typeCoffee) {
        this.typeCoffee = typeCoffee;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "kolMilk=" + kolMilk +
                ", kolWater=" + kolWater +
                ", typeCoffee=" + typeCoffee +
                '}';
    }
}
