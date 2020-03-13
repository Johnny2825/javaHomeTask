public class Cat extends Animal {
    private static int amountCat = 0;

    public Cat(String name, int maxRun, int maxHeight) {
        super(name, maxRun, 0, maxHeight);
        amountCat++;
    }

    @Override
    public void swim(int distanceSwim) {
        System.out.println("Cat can't swim");
    }

    @Override
    public String getAmount() {
        return ("Количество объектов " + getClass() + " " + amountCat);
    }
}
