public class Animal {
    private static int amountAnimal = 0;
    public int maxRun;
    public int maxSwim;
    public int maxHeight;
    public String name;

    public Animal(String name, int maxRun, int maxSwim, int maxHeight){
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxHeight = maxHeight;
        amountAnimal++;
    }

    public String getName(){
        return name;
    }

    public String getAmount() {
        return ("Количество объектов " + getClass() + " " + amountAnimal);
    }

    public void run(int distanceRun) {
        if (distanceRun <= maxRun) {
            System.out.println(name + " running " + distanceRun + " true");
        } else {
            System.out.println("Run: false");
        }
    }

    public void swim(int distanceSwim) {
        if (distanceSwim <= maxSwim) {
            System.out.println(name + " swimming " + distanceSwim + " true");
        } else {
            System.out.println("Swim: false");
        }
    }

    public void jump(int height) {
        if (height < maxHeight) {
            System.out.println(name + " jumped " + height + " true");
        } else {
            System.out.println("Jump: false");
        }
    }
}