public class Cat {
    private String name;
    private int appetite;
    private boolean bellyful = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        if(p.decreaseFood(appetite)){
            bellyful = true;
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getBellyful(){
        return bellyful;
    }
}
