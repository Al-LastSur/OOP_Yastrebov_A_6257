package practice01.OwnPractice;

public class HotDrink extends BottleOfWater {
    private int temperature;
    public HotDrink(String name, int cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature (int temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "HotDrink{" + super.toString() +
                "temperature=" + temperature +
                '}';
    }
}
