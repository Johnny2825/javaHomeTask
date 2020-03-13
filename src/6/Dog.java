public class Dog extends Animal{
    private static int amountDog = 0;

    public Dog(String name, int maxRun, int maxSwim, int maxHeight) {
        super(name, maxRun, maxSwim, maxHeight);
        amountDog++;
    }

    @Override
    public String getAmount() {
        return ("Количество объектов " + getClass() + " " + amountDog);
    }
}
