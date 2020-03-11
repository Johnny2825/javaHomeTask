public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if(food >= n){
            food -= n;
            return true;
        } else {
            System.out.println("Isn't enough food");
            return false;
        }
    }
    public void info() {
        System.out.println("Plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        System.out.println("Add food. In plate " + food);
        this.food = food;
    }
}
