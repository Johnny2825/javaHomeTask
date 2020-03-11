import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random random = new Random();
        Cat [] cat = new Cat[10];
        Plate plate = new Plate(55);

        for(int i = 0; i < cat.length; i++){
            cat[i] = new Cat("Cat " + i, random.nextInt(20));
        }

       // for(int i = 0; i < cat.length; i++){
        //      System.out.println(cat[i].getName());
       // }

        System.out.println("In plate: " + plate.getFood());
        plate.setFood(plate.getFood() + random.nextInt(30));
        System.out.println("In plate: " + plate.getFood());

        int i = 0;
        while(i != cat.length){
            System.out.println(cat[i].getName() + " needs " + cat[i].getAppetite() + " foods");
            if (plate.getFood() < cat[i].getAppetite()){
                plate.setFood(cat[i].getAppetite() - plate.getFood());
            }
            cat[i].eat(plate);
            System.out.println(cat[i].getName() + " " + cat[i].getBellyful() + " in plate: " + plate.getFood());
            i++;
        }
    }
}
